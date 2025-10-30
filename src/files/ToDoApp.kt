package files

import java.io.File

fun main() {
    val file = File("toDo.txt")

    while (true) {
        println("\n=== МЕНЮ ЗАДАЧ ===")
        println("1 - Добавить задачу")
        println("2 - Показать все задачи")
        println("3 - Удалить задачу")
        println("0 - Выход")
        print("Выберите действие: ")

        when (readln()) {
            "1" -> {
                println("Введите новую задачу: ")
                val task = readln()
                file.appendText("$task\n")
                println("Задача добавлина")
            }
            "2" -> {
                println("Все задачи")
                if (file.exists() && file.readLines().isNotEmpty()) {
                    file.readLines().forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                } else {
                    println("Список пуст")
                }
            }
            "3" -> {
                val tasks = file.readLines().toMutableList()

                if (tasks.isEmpty()) {
                    println("Список задач пуст.")
                }
                else {
                    println("Задачи для удоления: ")
                    tasks.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                    print("Введите номер задачи для удаления: ")
                    val num = readln().toIntOrNull()
                    if ( num == null || num !in 1..tasks.size) {
                        println("Некоректный номер.")
                    }
                    else {
                        val removed = tasks.removeAt(num-1)
                        file.writeText("")
                        tasks.forEach { file.appendText("$it\n") }
                        println("Задача \"$removed\" удалина")
                    }
                }
            }
            "0" -> {
                println("Выход из программы")
                break
            }
            else -> println("Некоректный ввод")
        }


    }

}