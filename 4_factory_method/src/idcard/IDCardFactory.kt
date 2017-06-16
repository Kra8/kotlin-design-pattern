package idcard

import framework.Factory
import framework.Product

class IDCardFactory : Factory() {

    private val owners = mutableMapOf<Int, String>()
    private var index  = 0

    override fun createProduct(owner : String) : Product {
        val card    = IDCard(owner, this.index)
        this.index  = this.index + 1
        return card
    }

    override fun registerProduct(product : Product) {
        if (product is IDCard) {
            this.owners.put(product.getNumber(), product.getOwner())
        }
    }

    fun getOwners() : MutableMap<Int, String> {
        return this.owners
    }

}
