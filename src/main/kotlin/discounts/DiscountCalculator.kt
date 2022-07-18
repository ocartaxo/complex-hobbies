package discounts

import orcamento.Budget
import java.math.BigDecimal

class DiscountCalculator {

    fun compute(b: Budget, d: Discount): BigDecimal {
        return d.compute(b)
    }
}