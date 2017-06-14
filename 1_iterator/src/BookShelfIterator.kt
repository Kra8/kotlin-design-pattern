class BookShelfIterator(bookShelf : BookShelf) : Iterator {
    private val bookShelf   = bookShelf
    private var index       = 0

    override fun hasNext() : Boolean {
        return index < bookShelf.getLength()
    }

    override fun next() : Any {
        val book = bookShelf.getBookAt(this.index)
        this.index = this.index + 1
        return book
    }
}
