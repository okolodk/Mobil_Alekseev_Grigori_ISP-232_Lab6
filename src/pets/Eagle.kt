package pets

class Eagle(name : String) : Pet(name = name, speed = 250, maxHealth = 50){
    val flightHeight : Int = 0
    override fun makeSound() {
        println("$name кричит.")
    }

    override fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHealth")
        println("Speed - $speed")
        println("$name Видит всё далеко")
    }
}