package utils

import com.jayway.jsonpath.JsonPath
import java.io.File
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

/**
 * Объект вопроса, состоящий из текста вопроса, правильного ответа и неправильных ответов
 */
object Question {

    private var file = File("src/main/resources/questions/testQuestion.json")
    lateinit var questionText: String
    lateinit var correctAnswer: String
    lateinit var wrongAnswer: List<String>

    /**
     * @param number индекс вопроса в JSON файле
     * @return вопрос по индексу
     */
    fun getQuestion(number: Int): Question {
        questionText = JsonPath.read<String>(file, "$.questions[$number].text")
        correctAnswer = JsonPath.read<String>(file, "$.questions[$number].correct")
        wrongAnswer = JsonPath.read<List<String>>(file, "$.questions[$number].wrong")
        return this
    }

    /**
     * @return текст вопроса и ответов
     */
    override fun toString() =
        "text = $questionText" +
                "\ncorrect = $correctAnswer" +
                "\nwrong = $wrongAnswer"

    /**
     * @return рандомный вопрос
     */
    fun getRandomQuestion() =
        getQuestion(
            Random.nextInt(0, getNumbersOfQuestions())
        )

    /**
     * @return Количество вопросов в JSON файле
     */
    private fun getNumbersOfQuestions(): Int {
        return JsonPath.read<List<String>>(file, "$.questions").size
    }

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