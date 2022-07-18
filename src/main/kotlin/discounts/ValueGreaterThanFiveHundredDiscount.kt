package discounts

import orcamento.Budget
import java.math.BigDecimal

class ValueGreaterThanFiveHundredDiscount(nextDiscount: Discount?): Discount(nextDiscount) {
    override fun compute(b: Budget): BigDecimal {
        return if (b.value > BigDecimal("500"))
            b.value.multiply(BigDecimal("0.05"))
        else nextDiscount?.compute(b) ?: BigDecimal.ZERO


    }
}