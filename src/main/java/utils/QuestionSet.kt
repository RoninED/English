package utils

import com.jayway.jsonpath.JsonPath
import net.minidev.json.reader.JsonWriter
import java.io.File
import kotlin.random.Random

class QuestionSet (var questions: ArrayList<Question>){

    /**
     * @param index индекс вопроса в JSON файле
     * @return вопрос по индексу
     */
    fun getQuestion(index: Int): Question = questions[index]

    /**
     * @return рандомный Question
     */
    fun getRandomQuestion() = getQuestion(
            Random.nextInt(0, getNumbersOfQuestions())
        )

    /**
     * @return Количество Question в JSON файле
     */
    private fun getNumbersOfQuestions(): Int = questions.size
}