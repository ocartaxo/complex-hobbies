package discounts

import orcamento.Budget
import java.math.BigDecimal

class FiveItensDiscount(nextDiscount: Discount?) : Discount(nextDiscount) {

    override fun compute(b: Budget): BigDecimal {
        return if (b.intensQuantity > 5)
            b.value.multiply(BigDecimal("0.1"))
        else nextDiscount?.compute(b) ?: BigDecimal.ZERO
    }
}