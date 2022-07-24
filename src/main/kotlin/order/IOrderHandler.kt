package order

interface IOrderHandler {
    fun execute(o: CreateOrder)
}
