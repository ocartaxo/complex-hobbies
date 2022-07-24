package budgets.state

import budgets.Budget
import java.math.BigDecimal

class Approved: BudgetState() {

    override fun computeExtraDiscount(b: Budget): BigDecimal = b.value.multiply(BigDecimal("0.02"))

    override fun conclude(b: Budget) {

    }
}