import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.*
import io.ktor.client.request.parameter
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

suspend fun main() {
    val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }
    val response: HttpResponse = client.get("https://youtrack.jetbrains.com/api/issues") {
        parameter("fields", "idReadable,summary,fields(name,value(name))")
    }

    val issues: List<Issue> = response.body()
    println(issues)
}

@Serializable
data class Issue(
    val idReadable: String,
    val summary: String,
    val fields: List<Field>
)

@Serializable
data class Field(
    val name: String,
    val value: JsonElement? = null
)