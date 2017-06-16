package idcard

import framework.Product

class IDCard(private val owner : String, private val number : Int) : Product() {

    init {
        println("${owner}(${number})のカードを作ります。")
    }

    override fun use() {
        println("${this.owner}(${this.number})のカードを使います")
    }

    fun getOwner() : String {
        return this.owner
    }

    fun getNumber() : Int {
        return this.number
    }

}
