package characters
import  magic.Spell
fun main() {
    val hero1 = Hero(name = "Артур", hp = 100)
    println("Герой жив? ${hero1.isAlive()}")
    val hero2 = Hero(name = "Артур", hp = 0)
    println("Герой жив? ${hero2.isAlive()}")

    val naruto = Hero(
        name = "Наруто",
        gender = "мужской",
        role = "Шиноби",
        hp = 150,
        mp = 200,
        level = 7,
        element = "Ветер"
    )

    val Spell1 = Spell("Огненный шар", 3, 3, "\uD83D\uDD25")
    val Spell2 = Spell("Молния", 5, 6, "\u26A1")
    val Spell3 = Spell("Иллюзия (звёздочки) ", 2, 2, "\uD83D\uDCAB")

    println("Наруто может применить ${Spell1.name}? ${naruto.canCast(Spell1)}")
    println("Наруто может применить ${Spell2.name}? ${naruto.canCast(Spell2)}")
    println("Наруто может применить ${Spell3.name}? ${naruto.canCast(Spell3)}")
}
