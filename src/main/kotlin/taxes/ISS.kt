package taxes

import java.math.BigDecimal
import budgets.Budget

class ISS : ITax {

    override fun compute(b: Budget): BigDecimal {
        return b.value.multiply(BigDecimal("0.06"))
    }

}