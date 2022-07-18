package impostos

import java.math.BigDecimal
import orcamento.Budget

class ICMS : ITax{

    override fun compute(b: Budget): BigDecimal {
        return b.value.multiply(BigDecimal("0.1"))
    }

}