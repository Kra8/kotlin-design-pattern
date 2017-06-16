package template.method

class StringDisplay(private val string : String) : AbstractDisplay() {

    private val width = string.toByteArray().size

    override fun open() {
        this.printLine()
    }

    override fun print() {
        println("|" + this.string + "|")
    }

    override fun close() {
        this.printLine()
    }

    private fun printLine() {
        print("+")
        for(i in 1..this.width) {
            print("-")
        }
        println("+")
    }

}
