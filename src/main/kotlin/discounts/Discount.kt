package discounts

import orcamento.Budget
import java.math.BigDecimal

abstract class Discount(val nextDiscount: Discount?) {

    abstract fun compute(b: Budget): BigDecimal
}