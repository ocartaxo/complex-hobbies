package http

interface IHttpAdapter {
    fun post(url: String, payload: Map<String, Any>)
}