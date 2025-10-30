package characters
import  world.Quest
import  world.QuestType
fun main() {
//    val trader = Trader("Ральф")
//
//    trader.addQuest(
//        Quest(
//            title = "Собрать травы", duration = 2,
//            reward = 50, difficulty = "Лёгкий", QuestType.DELIVERY
//        )
//    )
//    trader.addQuest(
//        Quest(
//            title = "Убить волков", duration = 3,
//            reward = 100, difficulty = "Средний", QuestType.ELIMINATION
//        )
//    )
//
//    trader.showAvailableQuests()
//
//    val selectedQuest = trader.giveQuest(index = 1)
//    selectedQuest.describe()

    val trader = TraderHomeWork()

    trader.start()

}
//// Тестируем NPC
//    val blacksmith = NPC(name = "Кузнец Ульфрик", hasQuest = true)
//    println(blacksmith.giveQuest())
//    blacksmith.trade()
//
//// Тестируем Boss
//    val dragon = Boss(name = "Алдуин", hp = 500, element = "Огонь", phaseCount = 4,
//        isFinalBoss = true)
//    dragon.startPhase(phaseNumber = 2)
//    println(dragon.dropLoot())
//    dragon.takeDamage(amount = 150)
//}
