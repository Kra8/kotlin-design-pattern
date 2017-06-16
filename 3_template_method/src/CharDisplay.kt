package template.method

class CharDisplay(private val ch : Char) : AbstractDisplay() {
    override fun open() {
        print("<<")
    }

    override fun print() {
        print(this.ch)
    }

    override fun close() {
        println(">>")
    }

}
