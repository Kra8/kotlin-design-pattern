package framework

abstract class Factory {

    final fun create(owner : String) : Product {
        val product = this.createProduct(owner)
        this.registerProduct(product)
        return product
    }

    abstract protected fun createProduct(owner : String) : Product
    abstract protected fun registerProduct(product : Product)
    
}
