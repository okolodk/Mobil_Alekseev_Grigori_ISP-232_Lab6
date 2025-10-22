package pets

class Wolf(name : String) : Pet(name = name, speed = 100, maxHealth = 250) {
    val packSize : Int = 5
    override fun makeSound() {
        println("$name воет.")
    }
    override fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHealth")
        println("Speed - $speed")
        println("$name Стая - ${packSize}")
    }
}