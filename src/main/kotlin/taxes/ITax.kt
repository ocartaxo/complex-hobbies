package taxes

import budgets.Budget
import java.math.BigDecimal

interface ITax {
    fun compute(b: Budget): BigDecimal
}
