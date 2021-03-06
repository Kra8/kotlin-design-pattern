package template.method

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()

    final fun display() {
        this.open()
        for(i in 1..5) {
            this.print()
        }
        this.close()
    }
}
