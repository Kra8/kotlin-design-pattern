class BookShelf() : Aggreate {
    private val books = mutableListOf<Book>()

    fun getBookAt(index : Int) : Book {
        return this.books.get(index)
    }

    fun appendBook(book : Book) {
        this.books.add(book)
    }

    fun getLength() : Int {
        return this.books.size
    }

    override fun iterator() : Iterator {
        return BookShelfIterator(this)
    }

}
