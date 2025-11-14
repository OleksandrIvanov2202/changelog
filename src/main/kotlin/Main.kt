import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.readUTF8Line

suspend fun main() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://youtrack.jetbrains.com/api/issues")
    println("Result: ${response.bodyAsText()}")
}