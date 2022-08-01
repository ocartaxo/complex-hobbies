package taxes

import java.math.BigDecimal
import budgets.Budget

class ICMS(private val other: Tax?) : Tax(other) {

    override fun computeIndividualTax(b: Budget): BigDecimal {
        return b.value.multiply(BigDecimal("0.1"))
    }

}