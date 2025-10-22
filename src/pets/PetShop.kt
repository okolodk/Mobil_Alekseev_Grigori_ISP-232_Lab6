package pets

fun main() {
    val pets = listOf(
        Wolf("Фенрир"),
        Cat("Мурзик"),
        Eagle("Скайвинд"),
        Bear("Балу")
    )
    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}