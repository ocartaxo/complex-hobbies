package http


import java.net.URL

class KHttpClient: IHttpAdapter {
    override fun post(url: String, payload: Map<String, Any>) {
        try {
            val apiUrl = URL(url)
            val connection = apiUrl.openConnection()
            connection.connect()

        } catch (ex: Exception) {
            throw RuntimeException("Erro ao enviar a requisição http", ex)
        }
    }
}