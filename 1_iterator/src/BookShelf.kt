class BookShelf : Aggreate {
    private val books : Array<Book?>
    private var last : Int


    constructor(maxsize : Int) {
        this.books = arrayOfNulls(maxsize)
        this.last  = 0
    }

    fun getBookAt(index : Int) : Book {
        return this.books[index]!!
    }

    fun appendBook(book : Book) {
        this.books[this.last] = book
        this.last = this.last + 1
    }

    fun getLength() : Int {
        return this.last
    }

    override fun iterator() : Iterator {
        return BookShelfIterator(this)
    }

}
