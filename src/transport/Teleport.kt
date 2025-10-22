package transport

class Teleport (
    name : String,
    speed : Int,
    capacity : Int,
) : Transport(name, speed, capacity) {
    override fun move() {
        println("мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("нужна мана для активации, мгновенное перемещение")
    }
}