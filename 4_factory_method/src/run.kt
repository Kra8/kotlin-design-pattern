import framework.Factory
import framework.Product
import idcard.IDCardFactory
import idcard.IDCard

fun main(args : Array<String>) {
    val factory = IDCardFactory()
    val card1   = factory.create("結城浩")
    val card2   = factory.create("とむら")
    val card3   = factory.create("佐藤花子")

    card1.use()
    card2.use()
    card3.use()

    val owners = factory.getOwners()
    for((key, value) in owners) {
        println("${key}:${value}")
    }
}
