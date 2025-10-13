package characters

fun main() {
    val hero1 = Hero(name = "Артур", hp = 100)
    println("Герой жив? ${hero1.isAlive()}")
    val hero2 = Hero(name = "Артур", hp = 0)
    println("Герой жив? ${hero2.isAlive()}")
}
