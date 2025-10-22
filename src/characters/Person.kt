package characters
import  magic.Spell
fun main() {
// Тестируем NPC
    val blacksmith = NPC(name = "Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()

// Тестируем Boss
    val dragon = Boss(name = "Алдуин", hp = 500, element = "Огонь", phaseCount = 4,
        isFinalBoss = true)
    dragon.startPhase(phaseNumber = 2)
    println(dragon.dropLoot())
    dragon.takeDamage(amount = 150)
}
