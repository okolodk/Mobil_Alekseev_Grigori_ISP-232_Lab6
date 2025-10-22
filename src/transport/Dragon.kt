package transport

class Dragon(
    name : String,
    speed : Int,
    capacity : Int,
) : Transport(name, speed, capacity) {
    override fun move() {
        println("летит высоко над землёй")
    }

    override fun specialAbility() {
        println("дышит огнём и перевозит героя по воздуху")
    }
}