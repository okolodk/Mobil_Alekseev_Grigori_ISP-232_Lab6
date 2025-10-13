package Class

class Quest(
    val title: String,
    val duration: Int,
    val reward: Int,
    val difficulty: String
) {
    fun printInfo() {
        println("Название квеста: $title")
        println("Время выполнения: $duration часов")
        println("Награда: $reward монет")
        println("Уровень сложности: $difficulty")
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int {
        if (duration == 0) { return 0}
        return reward / duration
    }
}