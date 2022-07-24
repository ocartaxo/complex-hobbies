package budgets.state

import budgets.Budget
import java.math.BigDecimal

class Reproved : BudgetState() {
    override fun computeExtraDiscount(b: Budget): BigDecimal = b.value.multiply("0".toBigDecimal())

    override fun conclude(b: Budget) {
        b.updateState(Concluded())
    }
}
