package taxes

import budgets.Budget
import java.math.BigDecimal

class TaxCalculator {
    fun compute(b: Budget, tax: Tax): BigDecimal {
        return tax.compute(b)
    }
}