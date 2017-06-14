//
// 以下のクラスの書き方はKotlinの構文で、プロパティの初期化と代入を行える
//
class Book(private val name : String) {
    fun getName() : String {
        return this.name
    }
}
