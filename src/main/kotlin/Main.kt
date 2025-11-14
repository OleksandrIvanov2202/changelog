import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.*
import io.ktor.client.request.parameter
import io.ktor.client.statement.*
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

suspend fun main(args: Array<String>) {
    if (args.isEmpty()) {
        System.err.println("Error: Missing release version argument.\nUsage: ./gradlew run --args=\"2.3.0-Beta1\"")
        return
    }

    val version = args[0].trim()
    val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }
    val response: HttpResponse = client.get("https://youtrack.jetbrains.com/api/issues") {
        parameter("fields", "idReadable,summary,fields(name,value(name))")
        parameter("query", "project: KT State: Fixed {Available in}: $version")
    }

    if (response.status != HttpStatusCode.OK) {
        System.err.println("Failed to fetch issues. HTTP ${response.status}\n${response.bodyAsText()}")
        return
    }

    val issues: List<Issue> = response.body()
    val grouped = convertIssues(issues).groupBy { it.subcategory }.toSortedMap().mapValues {
        it.value.sortedBy { it.id }
    }

    grouped.forEach { k, v -> println("$k -> $v") }
}

fun convertIssues(issues: List<Issue>): List<MarkdownIssue> {
    return issues.map {
        MarkdownIssue(
            id = it.idReadable,
            summary = it.summary,
            subcategory = it.getSubcategory()
        )
    }
}

data class MarkdownIssue(
    val id: String,
    val summary: String,
    val subcategory: String,
)

@Serializable
data class Issue(
    val idReadable: String,
    val summary: String,
    val fields: List<Field>
) {
    fun getSubcategory(): String {
        val subsystems = fields.firstOrNull { it.name == "Subsystems" }
            ?.value
        if (subsystems is JsonArray) {
            return subsystems.firstOrNull()?.jsonObject["name"]?.jsonPrimitive?.contentOrNull ?: "Uncategorized"
        }
        return "Uncategorized"
    }
}

@Serializable
data class Field(
    val name: String,
    val value: JsonElement? = null
)