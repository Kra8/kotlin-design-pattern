package template.method

fun main(args : Array<String>) {
    val d1 : AbstractDisplay = CharDisplay('H')
    val d2 : AbstractDisplay = StringDisplay("Hello World")
    //日本語はutf-8のByteCodeは3Byte必要なことがあるため、現在の実装では正確な表示はできない。
    val d3 : AbstractDisplay = StringDisplay("こんにちは。")

    d1.display()
    d2.display()
    d3.display()
}
