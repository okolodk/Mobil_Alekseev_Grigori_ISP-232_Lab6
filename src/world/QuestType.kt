package world

enum class QuestType(val description: String) {
    DELIVERY("Доставка предмета"),
    ELIMINATION("Устронение противника"),
    ESCORT("Сопровождение персонажа"),
    EXPLORE("Иследование новой теретории"),
    BOSSFIGHT("Битва с боссом")
}