package characters

open class Enemy(
    name: String,
    hp: Int = 0,
    element: String = "Неизвестный",
    val  aggressionLevel: Int = 2
) : GameCharacter(name, hp, element) {
    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp < 0) hp = 0
        println("$name получает урон: $amount. Осталось HP: $hp");
    }
    fun isStrong(): Boolean {
        return hp > 100
    }
    fun getThreatLevel(): String {
        if (hp < 0) return "Некорректное здоровье"
        return when {
            hp <= 50 -> "Низкий"
            hp <= 150 -> "Средний"
            else -> "Высокий"
        }
    }
    fun calculatePower(): Int {
        val power = hp * aggressionLevel
        return power
    }
}