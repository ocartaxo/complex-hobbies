package order

interface IActionsAfterCreateOrder {
    fun execute(o: Order)
}