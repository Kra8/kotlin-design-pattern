package adapter

fun main(args : Array<String>) {
    // 継承を用いた場合
    val pE = adapter.extension.PrintBanner("Hello")

    pE.printWeak()
    pE.printStrong()

    // 委譲を用いた場合
    val pD = adapter.delegate.PrintBanner("Hello")

    pD.printWeak()
    pD.printStrong()
}
