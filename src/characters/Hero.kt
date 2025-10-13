package characters


import Class.Quest


class Hero(
    val name: String,
    var hp: Int,
    val gender: String = "Мужской",
    val role: String = "Воин",
    var mp: Int = 50,
    var level: Int = 1,
    val element: String = "Огонь")
{
    fun introduce() {
        println("Привет! Я $name, герой $level уровня со стихией $element.")
    }

    fun showStats() {
        println("$name | HP: $hp | MP: $mp | Уровень: $level | Стихия: $element")
    }

    fun meditate() {
        mp += 20
        println("$name медитирует. Текущая мана: $mp")
    }

    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp < 0) hp = 0
        println("$name получил урон: $amount. Осталось HP: $hp")
        if (hp == 0) die()
    }

    private fun die() {
        println("Герой умер")
    }

    fun castSpell(): Boolean {
        if (mp >= 10) {
            mp -= 10
            println("$name использует магию!")
            return true
        } else {
            println("Недостаточно маны! У вас только $mp.")
            return false
        }
    }

    fun heal() {
        if (mp >= 10) {
            mp -= 10
            hp += 10
            println("$name восстановил здоровье. Текущее HP: $hp")
        } else {
            println("Недостаточно маны для лечения! У вас только $mp.")
        }
    }

    fun attack(enemy: Enemy) {
        val damage = 20
        println("$name атакует ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        if (mp < 10) {
            println("Недостаточно маны для заклинания!")
            return
        }

        var finalDamage = damage
        if (this.element == enemy.element) {
            finalDamage /= 2
            println("Эффект стихии: урон снижен! ($damage → $finalDamage)")
        }

        mp -= 10
        println("$name применяет заклинание '$spellName' и наносит $finalDamage урона!")
        enemy.takeDamage(finalDamage)
        println("Остаток маны: $mp")
    }

    fun duel(opponent: Hero) {
        println("\n=== Поединок: ${this.name} vs ${opponent.name} ===")
        while (this.hp > 0 && opponent.hp > 0) {
            this.takeDamage(20)
            if (this.hp <= 0) break
            opponent.takeDamage(15)
            if (opponent.hp <= 0) break
            this.showStats()
            opponent.showStats()
        }
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept =  when (quest.difficulty.lowercase()) {
            "лёгкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }
        if (canAccept) {
            println("$name может принять квест <<${quest.title}")
        }
        else {
            println("$name не может принять квест <<${quest.title}")

        }
        return canAccept
    }
}