package pets

open class Pet (
    val name : String,
    val maxHealth: Int,
    val speed: Int
) {
    open fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHealth")
        println("Speed - $speed")
    }
    open fun makeSound() {
        println("$name подает голос")
    }
}