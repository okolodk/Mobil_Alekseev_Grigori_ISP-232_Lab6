package task2

fun main() {
    val l = Location("Лес")
    val l1 = Location("Бездна", "Высокий", 50)
   if (l.isDangerous()) {
       println("Локация сложная? Да")
   }
    else {
       println("Локация сложная? Нет")

   }
    if (l1.isDangerous()) {
        println("Локация сложная? Да")
    }
    else {
        println("Локация сложная? Нет")

    }
}