package adapter.delegate

class PrintBanner(string : String) : Print() {

    private val banner = adapter.Banner(string)

    override fun printWeak() {
        this.banner.showWithParen()
    }

    override fun printStrong() {
        this.banner.showWithAster()
    }
}
