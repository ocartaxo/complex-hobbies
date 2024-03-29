package order

import budgets.Budget
import java.time.LocalDateTime
import java.util.*

class OrdersHandler(private val actions: List<IActionsAfterCreateOrder>): IOrderHandler {

    override fun execute(o: CreateOrder) {

        val budget = Budget(o.itensQuantity, o.budgetValue)
        val order = Order(UUID.randomUUID().toString(),  o.clientName, LocalDateTime.now(), budget)

        actions.forEach { a -> a.execute(order) }
    }
}