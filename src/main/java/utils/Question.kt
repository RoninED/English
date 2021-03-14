package utils

import com.jayway.jsonpath.JsonPath
import kotlin.collections.ArrayList


/**
 * Вопрос, состоящий из текста вопроса, правильного ответа и неправильных ответов
 */
data class Question(
    var text: String,
    var correct: String,
    var wrong: List<String>,
    var theme: String,
    var tagTheme: String,
    var progress: Int
){

    fun mixOfAnswers (): List<String> {
        var answers: ArrayList<String> = ArrayList()
        answers.addAll(wrong)
        answers.add(correct)
        return answers.shuffled()
    }

}