package budgets.state

import budgets.Budget
import exceptions.DomainException
import java.math.BigDecimal

class Concluded : BudgetState() {
    override fun computeExtraDiscount(b: Budget): BigDecimal {
        throw DomainException("Orçamento finalizado não possuí desconto extra!")
    }
}
