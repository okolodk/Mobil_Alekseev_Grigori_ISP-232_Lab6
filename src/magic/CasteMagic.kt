package magic

fun main() {
    val fireWall = Spell(
        name = "Огненная Стена",
        width = 5,
        height = 3,
        symbol = "\uD83D\uDD25"
    )
    fireWall.cast()

    val iceShield = Spell(
        name = "Ледяной Щит",
        width = 4,
        height = 4,
        symbol = "\u2744\uFE0F"
    )
    iceShield.cast()
}
