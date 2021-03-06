package utils

import kotlin.system.exitProcess

class CommonUtils {
    companion object {

        fun askRandomQuestions() {
            var count: Int
            var answers: List<String>
            var answer: Int
            var correctAnswers: Int = 0
            var wrongAnswers: Int = 0

            println("0 - выход\n")

            while (true) {
                QuestionsSets.getRandomQuestionSet().getRandomQuestion()
                answers = Question.mixOfAnswers()

                println(Question.questionText)

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
                    exitProcess(-1)
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
    }
}