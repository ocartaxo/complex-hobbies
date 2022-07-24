package budgets.state

import budgets.Budget
import java.math.BigDecimal

class Evaluating: BudgetState() {

    override fun computeExtraDiscount(b: Budget): BigDecimal = b.value.multiply((.05).toBigDecimal())

    override fun approve(b: Budget) {
        b.updateState(Approved())
    }

    fun reproved(b: Budget) {
        b.updateState(Reproved())
    }
}