class BookShelfIterator : Iterator {
    private val bookShelf : BookShelf
    private var index : Int

    constructor(bookShelf : BookShelf)  {
        this.bookShelf  = bookShelf
        this.index      = 0
    }

    override fun hasNext() : Boolean {
        return index < bookShelf.getLength()
    }

    override fun next() : Any {
        val book = bookShelf.getBookAt(this.index)
        this.index = this.index + 1
        return book
    }
}
