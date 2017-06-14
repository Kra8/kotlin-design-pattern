package adapter

fun main(args : Array<String>) {
    // 継承を用いた場合
    val pE : adapter.extension.Print = adapter.extension.PrintBanner("Hello")

    pE.printWeak()
    pE.printStrong()

    // 委譲を用いた場合
    val pD : adapter.delegate.Print = adapter.delegate.PrintBanner("Hello")

    pD.printWeak()
    pD.printStrong()

    // 練習問題
    val f : FileIO = FileProperties()

    try {
        f.readFromFile("file.txt")
        f.setValue("month", "4")
        f.setValue("day", "21")
        f.writeToFile("newFile.txt")
    } catch (e : FileSystemException) {
        e.printStackTrace()
    }
}
