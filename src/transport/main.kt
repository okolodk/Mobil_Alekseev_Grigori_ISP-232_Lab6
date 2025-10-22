package transport

fun main() {
    val horse: Transport = Horse("horse", 30, 2)
    val dragon: Transport = Dragon("dragon", 100, 2)
    val boat: Transport = Boat("boat", 20, 4)
    val teleport: Transport = Teleport("teleport", 0, 1)

    horse.describe()
    horse.move()
    horse.specialAbility()
    println()

    dragon.describe()
    dragon.move()
    dragon.specialAbility()
    println()

    boat.describe()
    boat.move()
    boat.specialAbility()
    println()

    teleport.describe()
    teleport.move()
    teleport.specialAbility()

}