package world

class Quest(
    title : String,
    val duration: Int,
    reward : Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward){
    fun printInfo() {
        println("Название квеста: $title")
        println("Тип квеста: ${questType.description}")
        println("Время выполнения: $duration часов")
        println("Награда: $reward монет")
        println("Уровень сложности: $difficulty")

    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int {
        require(duration >= 0) {"Длительность не может быть отрецательной!"}
        return if (duration== 0) 0 else reward / duration
    }

    override fun describe() {
        println("Квест '$title'. Тип квеста: ${questType.description} на $duration часов, сложность: $difficulty, награда: $reward золотых")
    }
}