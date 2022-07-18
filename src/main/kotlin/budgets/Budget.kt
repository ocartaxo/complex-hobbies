package budgets

import java.math.BigDecimal

data class Budget(
    val value: BigDecimal,
    val intensQuantity: Int = 1
)
