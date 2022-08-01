package budgets

import java.math.BigDecimal

data class BudgetItem(
    override var value: BigDecimal
) : IBudgetable
