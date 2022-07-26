package discounts

import budgets.Budget
import exceptions.DomainException
import http.IHttpAdapter


class BudgetRecord(
    private val http: IHttpAdapter
) {

    fun register(b: Budget) {

        if(b.isConcluded()) {
            throw DomainException("Orçamento não finalizado")
        }

        val url = "https://external.api.com.br"
        val payload = mapOf(
            "valor" to b.value,
            "quantidadeDeItems" to b.itemsQuantity
        )
        http.post(url, payload)
    }
}