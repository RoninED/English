import utils.Question
import kotlin.system.exitProcess

fun main() {
    var count: Int
    var answers: List<String>
    var answer: Int
    var correctAnswers: Int = 0
    var wrongAnswers: Int = 0

    println("0 - выход\n")

    while (true) {
        Question.getRandomQuestion()

        println(Question.questionText)

        answers = Question.mixOfAnswers()

        count = 1
        answers.forEach {
            println("${count++} - $it")
        }

        print("\nВыберите вариант:")
        answer = readLine()!!.toInt() - 1

        if (answer == -1) {
            println(
                "\nПравильно = $correctAnswers" +
                        "\nОшибок = $wrongAnswers"
            )
            break
        }

        if (answers[answer].equals(Question.correctAnswer)) {
            correctAnswers++
            println("Верно\n")
        } else {
            wrongAnswers++
            println("Ошибка\n")
        }

    }
}

