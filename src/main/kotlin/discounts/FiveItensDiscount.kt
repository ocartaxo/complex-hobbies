package discounts

import orcamento.Budget
import java.math.BigDecimal

class FiveItensDiscount(nextDiscount: Discount?) : Discount(nextDiscount) {

    override fun computeDiscount(b: Budget): BigDecimal = b.value.multiply(BigDecimal("0.1"))
    override fun shouldApply(b: Budget): Boolean = b.intensQuantity > 5
}