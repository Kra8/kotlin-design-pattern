package adapter.extension

class PrintBanner(string : String) : adapter.Banner(string), Print {

    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}
