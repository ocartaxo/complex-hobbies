package order

class OrderLog : IActionsAfterCreateOrder{

    override fun execute(o: Order) {
        println("O pedido ${o.uuid} foi gerado")
    }

}