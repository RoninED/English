package utils

import kotlin.system.exitProcess

class CommonUtils {
    companion object {

        fun askRandomQuestions() {
            var question: Question = QuestionsSets.getRandomQuestionSet().getRandomQuestion()
            var count: Int
            var answers: List<String> = question.mixOfAnswers()
            var answer: Int
            var correctAnswers: Int = 0
            var wrongAnswers: Int = 0
            var temp = ""

            println("0 - выход\n")

            while (true) {


                println(question.text)

                count = 1
                answers.forEach {
                    println("${count++} - $it")
                }

                print("\nВыберите вариант:")

                temp = readLine()!!
                if (temp == "") {
                    println(
                        "\nПравильно = $correctAnswers" +
                                "\nОшибок = $wrongAnswers"
                    )
                    exitProcess(-1)
                } else {
                    answer = temp.toInt() - 1
                }

                if (answers[answer].equals(question.correct)) {
                    correctAnswers++
                    println("Верно\n")
                } else {
                    wrongAnswers++
                    println("Ошибка\n")
                }

            }


        }
    }
}