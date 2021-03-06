import utils.Question
import utils.QuestionSet
import utils.QuestionsSets
import kotlin.system.exitProcess

fun main() {

//    basic()
    testSomething()
}

/**
 * Для тестирования при разработке
 */
fun testSomething() {
    println(
        QuestionsSets
            .getQuestionSetByIndex(0).getQuestion(0).toString()

    )






}

/**
 * Основная программа
 */
fun basic() {
//    var count: Int
//    var answers: List<String>
//    var answer: Int
//    var correctAnswers: Int = 0
//    var wrongAnswers: Int = 0
//
//    println("0 - выход\n")
//
//    while (true) {
//        Question.getRandomQuestion()
//
//        println(Question.questionText)
//
//        answers = Question.mixOfAnswers()
//
//        count = 1
//        answers.forEach {
//            println("${count++} - $it")
//        }
//
//        print("\nВыберите вариант:")
//        answer = readLine()!!.toInt() - 1
//
//        if (answer == -1) {
//            println(
//                "\nПравильно = $correctAnswers" +
//                        "\nОшибок = $wrongAnswers"
//            )
//            exitProcess(-1)
//        }
//
//        if (answers[answer].equals(Question.correctAnswer)) {
//            correctAnswers++
//            println("Верно\n")
//        } else {
//            wrongAnswers++
//            println("Ошибка\n")
//        }
//
//    }
}

