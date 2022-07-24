package budgets.state

import budgets.Budget
import exceptions.DomainException
import java.math.BigDecimal

abstract class BudgetState {

    abstract fun computeExtraDiscount(b: Budget): BigDecimal

    open fun approve(b: Budget) {
        throw DomainException("Orçamento nao pode ser aprovado!")
    }

    fun reprove(b: Budget) {
        throw DomainException("Orçamento nao pode ser reprovado!")
    }

    open fun conclude(b: Budget){
        throw DomainException("Orçamento não pode ser finalizado!")
    }

}
