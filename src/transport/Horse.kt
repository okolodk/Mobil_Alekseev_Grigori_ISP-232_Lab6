package transport

class Horse(
    name : String,
    speed : Int,
    capacity : Int,
) : Transport(name, speed, capacity) {
    override fun move() {
        println("скачет по равнинам")
    }

    override fun specialAbility() {
        println("может ускориться в бою")
    }
}