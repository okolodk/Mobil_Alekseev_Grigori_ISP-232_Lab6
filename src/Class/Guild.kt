package Class

fun main() {
    val quest = Quest("Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? ${quest.isHard()}")
}