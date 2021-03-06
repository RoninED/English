package utils

import kotlin.collections.ArrayList


/**
 * Объект вопроса, состоящий из текста вопроса, правильного ответа и неправильных ответов
 */
object Question {
    var index: Int = 0
    lateinit var questionText: String
    lateinit var correctAnswer: String
    lateinit var wrongAnswer: List<String>

    /**
     * @return текст вопроса и ответов
     */
    override fun toString() =
        "text = $questionText" +
                "\ncorrect = $correctAnswer" +
                "\nwrong = $wrongAnswer"

    /**
     * @return перемешанный список ответов
     */
    fun mixOfAnswers (): List<String> {
        var answers: ArrayList<String> = ArrayList()
        answers.addAll(wrongAnswer)
        answers.add(correctAnswer)
        return answers.shuffled()
    }
}