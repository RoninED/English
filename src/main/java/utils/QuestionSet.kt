package utils

import com.jayway.jsonpath.JsonPath
import java.io.File
import kotlin.random.Random

object QuestionSet {
    var fileName: String = QuestionsSets.setOfQuestions[0].name

    private var file:File = File("src/main/resources/setOfQuestions/${utils.QuestionSet.fileName}")

    /**
     * @param index индекс вопроса в JSON файле
     * @return вопрос по индексу
     */
    fun getQuestion(index: Int): Question {
        file = File("src/main/resources/setOfQuestions/${utils.QuestionSet.fileName}")

        Question.index = index

        Question.questionText = JsonPath.read(file, "$.questions[$index].text")

        Question.correctAnswer = JsonPath.read(file, "$.questions[$index].correct")

        Question.wrongAnswer = JsonPath.read(file, "$.questions[$index].wrong")

        return Question
    }

    /**
     * @return рандомный Question
     */
    fun getRandomQuestion() =
        getQuestion(
            Random.nextInt(0, getNumbersOfQuestions())
        )

    /**
     * @return Количество Question в JSON файле
     */
    private fun getNumbersOfQuestions(): Int {
        return JsonPath.read<List<String>>(file, "$.questions").size
    }


}