package world

import kotlin.collections.listOf

fun main() {
    val quests = listOf<Quest>(
        Quest(title = "Поиск артефакта", duration = 3, reward = 800,
            difficulty = "Средний", QuestType.ESCORT),
        Quest(title = "AAA", duration = 3, reward = 800,
            difficulty = "Средний", QuestType.DELIVERY),
        Quest(title = "BBB", duration = 3, reward = 800,
            difficulty = "Средний", QuestType.BOSSFIGHT),
        Quest(title = "CCC", duration = 3, reward = 800,
            difficulty = "Средний", QuestType.EXPLORE),
        Quest(title = "DDD", duration = 3, reward = 800,
            difficulty = "Средний", QuestType.EXPLORE),
    )
    for (quest in quests) {
        quest.printInfo()
        println()
        quest.describe()
        println("=============================")
    }
    println()
    println("fun questExplore")

//    val contract = Contract(title = "Защита каравана",
//        clientName = "Гильдия купцов",
//        taskDescription = "Охрана груза", reward = 1200)
//
//    val specialOp = SpecialOperation(title = "Операция 'Тень'",
//        reward = 2500, requiredClearance = 2, isCovert = true)
//
//    println("Информация о квесте:")
//    println("Название: ${quest.title}, Награда: ${quest.reward}")
//
//    println("\nИнформация о контракте:")
//    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")
//
//    println("\nИнформация о спецоперации:")
//    println("Название: ${specialOp.title}")
//    specialOp.showReward()
//    val missions = listOf<Mission>(
//        Quest(title = "Охота на монстров", duration = 3, reward = 600, difficulty = "Средний", QuestType.ESCORT),
//        SpecialOperation(title = "Ночной рейд", reward = 1500, requiredClearance = 2,
//            isCovert = true),
//        Contract(title = "Сопровождение каравана", clientName = "Гильдия Торговцев",
//            taskDescription = "Доставить груз через лес", reward = 800, isUrgent = true)
//    )
//
//    for (mission in missions) {
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
//        println()
//    }
    fun questExplore() {
        for ( quest in quests) {
            if (quest.questType == QuestType.EXPLORE) {
                quest.printInfo()
                println()
            }
        }
    }
    questExplore()
}
