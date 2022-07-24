package budgets

import budgets.state.BudgetState
import java.math.BigDecimal

data class Budget(
    val value: BigDecimal,
    val itemsQuantity: Int = 1,
    private var state: BudgetState
) {

    fun approve() {
        state.approve(this)
    }

    fun reprove() {
        state.reprove(this)
    }

    fun conclude() {
        state.conclude(this)
    }

    fun updateState(bs: BudgetState) {
        state = bs
    }
}
