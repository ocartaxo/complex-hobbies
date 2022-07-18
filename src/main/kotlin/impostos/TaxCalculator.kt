package impostos

import orcamento.Budget
import java.math.BigDecimal

class TaxCalculator {
    fun compute(b: Budget, tax: ITax): BigDecimal {
        return tax.compute(b)
    }
}