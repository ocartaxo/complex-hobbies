package discounts

import budgets.Budget
import java.math.BigDecimal

class ValueGreaterThanFiveHundredDiscount(nextDiscount: Discount?): Discount(nextDiscount) {
    override fun computeDiscount(b: Budget): BigDecimal = b.value.multiply(BigDecimal("0.15"))
    override fun shouldApply(b: Budget): Boolean = b.value > BigDecimal("500.0")
}