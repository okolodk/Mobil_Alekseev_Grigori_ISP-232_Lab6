package magic

fun main() {
    val fireball = Spell(name = "Огненный шар", width = 3, height = 3,
        symbol = "\u083D\u0025")

    val heal = InstantSpell(name = "Лечение",
        symbol = "\u083D\u0C9A", power = 5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}
