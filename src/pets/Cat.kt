package pets

class Cat(name : String) : Pet(name = name, speed = 80, maxHealth = 150){
    val stealthLevel : Int = 90

    override fun makeSound() {
        println("$name may")
    }

    override fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHealth")
        println("Speed - $speed")
        println("$name скрытный. Скрытность - ${stealthLevel}")
    }
}