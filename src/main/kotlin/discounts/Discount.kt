package discounts

import budgets.Budget
import java.math.BigDecimal

abstract class Discount(private val nextDiscount: Discount?) {

    fun compute(b: Budget): BigDecimal {
        if (shouldApply(b)) {
            return computeDiscount(b)
        }

        return nextDiscount?.compute(b) ?: BigDecimal.ZERO
    }

    protected abstract fun computeDiscount(b: Budget): BigDecimal

    abstract fun shouldApply(b: Budget): Boolean
}