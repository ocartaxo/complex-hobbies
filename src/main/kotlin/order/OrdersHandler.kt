package order

import budgets.Budget
import java.time.LocalDateTime

class OrdersHandler(val actions: List<IActionsAfterCreateOrder>): IOrderHandler {

    override fun execute(o: CreateOrder) {

        val budget = Budget(o.itensQuantity, o.budgetValue)
        val order = Order(o.clientName, LocalDateTime.now(), budget)

        actions.forEach { a -> a.execute(order) }
    }
}