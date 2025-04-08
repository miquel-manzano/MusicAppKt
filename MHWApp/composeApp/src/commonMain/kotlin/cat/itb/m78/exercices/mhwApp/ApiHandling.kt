package cat.itb.m78.exercices.mhwApp

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Weapon(
    @SerialName("id") val weaponId: Int,
    @SerialName("name") val weaponName: String
)


object ApiMHW {
    private const val URLW = "https://mhw-db.com/weapons/"
    private val client = HttpClient() {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }
    suspend fun list() = client.get(URLW).body<List<Weapon>>()
    //suspend fun selectGame(id: Int) = client.get(URLFind + id).body<Weapon>()
}