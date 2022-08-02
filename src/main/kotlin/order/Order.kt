package order

import budgets.Budget
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class Order(
    val uuid: String,
    val clientName: String,
    val date: LocalDateTime,
    val budget: Budget
)

data class CreateOrder(
    val clientName: String,
    val budgetValue: BigDecimal,
    val itensQuantity: Int,
)