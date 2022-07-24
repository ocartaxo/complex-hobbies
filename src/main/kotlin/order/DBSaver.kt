package order

class DBSaver : IActionsAfterCreateOrder {

    override fun execute(o: Order) {
        println("Salvando no banco de dados")
    }
}