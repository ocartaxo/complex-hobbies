package impostos

import orcamento.Budget
import java.math.BigDecimal

interface ITax {
    fun compute(b: Budget): BigDecimal
}
