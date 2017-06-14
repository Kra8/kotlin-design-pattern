fun main(args: Array<String>) {
    val bookShelf = BookShelf()

    bookShelf.appendBook(Book("ネットワークはなぜつながるのか"))
    bookShelf.appendBook(Book("プログラムはなぜ動くのか"))
    bookShelf.appendBook(Book("Java言語で学ぶデザインパターン"))
    bookShelf.appendBook(Book("Java言語で学ぶデザインパターン(マルチスレッド)"))

    val it = bookShelf.iterator()

    while (it.hasNext()) {
        val book = it.next() as Book
        println(book.getName())
    }
}
