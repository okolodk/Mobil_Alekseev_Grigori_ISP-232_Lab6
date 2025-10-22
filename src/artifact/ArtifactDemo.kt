package artifact

fun main() {
    val magics = listOf<MagicItem>  (
        Weapon("Посох", 20, "Epic","Огонь", true),
        Potion("Зелье отравления", 30, "Common", 10, false),
        Potion("Зелье исциления", 30, "Common", 10, true),
        Relic("душа грешника", 100, "Epic", "демоническое", 4)
        )
    for (magic in magics) {
        magic.describe()
        println(magic.use())
    }
}