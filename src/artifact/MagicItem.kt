package artifact

open class MagicItem (
    val name : String,
    val power : Int,
    val rarity : String
) {
    open fun describe() {
        println("Name - $name. Power - $power. Rarity - $rarity")
    }
    open fun use() : String {
        return "эффектом применения"
    }
}