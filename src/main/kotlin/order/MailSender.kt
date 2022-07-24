package order

class MailSender : IActionsAfterCreateOrder {

    override fun execute(o: Order) {
        println("Enviando email")
    }
}