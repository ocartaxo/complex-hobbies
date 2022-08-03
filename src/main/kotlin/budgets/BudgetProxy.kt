package budgets

import java.math.BigDecimal

class BudgetProxy(
    val budget: Budget
): Budget() {

    override var value: BigDecimal? = null
        get() {
            if(field == null) {
                field = budget.value
            }
            return super.value
        }

}