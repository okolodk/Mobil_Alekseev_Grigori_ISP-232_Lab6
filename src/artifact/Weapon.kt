package artifact

class Weapon(
    name : String,
    power : Int,
    rarity : String,
    val damageType : String,
    val isTwoHanded : Boolean
)  : MagicItem(name, power, rarity){
    override fun describe() {
        println("Name - $name. Power - $power. Rarity - $rarity. DamageType - $damageType.")
    }

    override fun use() : String {
        return  "Наносит $damageType урон силой $power"
    }
}