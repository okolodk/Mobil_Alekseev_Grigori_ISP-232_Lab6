package artifact

class Relic(
    name : String,
    power : Int,
    rarity : String,
    val origin : String,
    var charges : Int
)  : MagicItem(name, power, rarity)  {
    override fun describe() {
        println("Name - $name. Power - $power. Rarity - $rarity. Origin - $origin.")
    }

    override fun use() : String {
        charges -= 1
        return  "Использована реликвия. Charges - $charges"
    }
}