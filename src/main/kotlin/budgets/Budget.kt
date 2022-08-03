package budgets

import budgets.state.BudgetState
import budgets.state.Concluded
import budgets.state.Evaluating
import java.math.BigDecimal

open class Budget(
    override var value: BigDecimal? = BigDecimal.ZERO,
    private var state: BudgetState = Evaluating(),
    private val items: MutableList<IBudgetable> = mutableListOf(),
) : IBudgetable {

    constructor(itemsQuantity: Int, budgetValue: BigDecimal) : this() {
        val valuePerItem = budgetValue.divide(itemsQuantity.toBigDecimal())
        for (i in 0..itemsQuantity) {
            this.addItem(BudgetItem(valuePerItem))
        }
    }

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

    fun isConcluded(): Boolean = state is Concluded

    fun itemsQuantity(): Int = items.size

    fun addItem(item: IBudgetable) {
        value = value?.add(item.value)
        items.add(item)
    }
}
