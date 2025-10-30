package characters

import world.Quest
import world.QuestType

class TraderHomeWork(
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun createQuest() {
        print("Введите название: ")
        val title : String = readln()
        print("Введите длительность: ")
        val duration: Int = readln().toInt()
        print("Введите награду: ")
        val  reward: Int = readln().toInt()
        print("Введите сложность: ")
        val difficulty: String = readln()
        print("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
        val qType = readln()

        var questType: QuestType = QuestType.DELIVERY
        when (qType) {
            "DELIVERY" -> {questType = QuestType.DELIVERY}
            "ELIMINATION" -> {questType = QuestType.ELIMINATION}
            "ESCORT" -> {questType = QuestType.ESCORT}
            "EXPLORE" -> {questType = QuestType.EXPLORE}
            "BOSSFIGHT" -> {questType = QuestType.BOSSFIGHT}
            else -> {questType = QuestType.DELIVERY}
        }
        val resQuest = Quest(title, duration, reward, difficulty, questType)
        addQuest(resQuest)
    }
    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест ${quest.title} добавлин")
    }
    fun showAvailableQuests() {
        if ( quests.isEmpty()) {
            println("Квестов нет")
        }else {
            println("Доступные квесты: ")
            quests.forEachIndexed { index, quest ->
                print(" ${index + 1}  ")
                quest.describe()
            }
        }
    }
    fun giveQuest(index: Int): Quest? {
        return  if( index in 1..quests.size) {
            quests[index-1]
        } else {
            null
        }
    }
    fun removeQuest(index: Int) {
        if( index in 1..quests.size) {
            quests.removeAt(index-1)
            println("Квест удалён")
        }
    }
    fun  start() {
        while (true) {
            println("\n=== МЕНЮ ЗАДАЧ ===")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Удалить квест")
            println("4 - Показать конкретный квест")
            println("0 - Выход")
            print("Ваш выбор: ")

            when (readln()) {
                "1" -> {createQuest()}
                "2" -> {showAvailableQuests()}
                "3" -> {
                    print("Введите индекс: ")
                    val index: Int = readln().toInt()
                    removeQuest(index)}
                "4" -> {
                    print("Введите индекс: ")
                    val index: Int = readln().toInt()
                    val resQuest = giveQuest(index)
                    if (resQuest != null) {
                        resQuest.describe()
                    } else {
                        println(resQuest)
                    }
                }
                "0" -> {
                    break
                }
            }
        }
    }
}