package characters

class NPC (
    name : String,
    hp : Int = 100,
    element : String = "Нетральный",
    val faction: String = "Городские жители",
    val hasQuest : Boolean  = false
) : GameCharacter(name, hp, element) {
    fun giveQuest() : String {
        return  if (hasQuest) {
            "$name предлогает вам квест"
        } else {
            "$name не имеет заданий для вас"
        }
    }
    fun trade() {
        println("$name открыл торговлю")
    }
}