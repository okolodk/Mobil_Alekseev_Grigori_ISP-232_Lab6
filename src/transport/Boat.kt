package transport

class Boat (
    name : String,
    speed : Int,
    capacity : Int,
) : Transport(name, speed, capacity) {
    override fun move() {
        println("плывёт по воде")
    }

    override fun specialAbility() {
        println("может перевозить группу по рекам и озёрам")
    }
}