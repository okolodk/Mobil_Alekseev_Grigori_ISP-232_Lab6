package transport

open class Transport (
    val name : String,
    val speed : Int,
    val capacity : Int,
) {
    fun describe() {
        println("Name - $name. Speed - $speed. Capacity - $capacity")
    }
    open fun move() {
        println("Транспорт двигается")
    }
    open  fun specialAbility() {

    }
}