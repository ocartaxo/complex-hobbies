package taxes

import budgets.Budget
import java.math.BigDecimal

abstract class Tax(
    private val other: Tax?
) {

    abstract fun computeIndividualTax(b: Budget): BigDecimal

    fun compute(b: Budget): BigDecimal {
        val taxValue = computeIndividualTax(b)
        val otherTaxValue = other?.computeIndividualTax(b) ?: BigDecimal.ZERO

        return taxValue.add(otherTaxValue)
    }
}