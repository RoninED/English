import com.jayway.jsonpath.JsonPath
import net.minidev.json.JSONArray
import java.io.File
import kotlin.random.Random

object Question {
    private var file = File("src/main/resources/questions/testQuestion.json")
    private lateinit var questionText: String
    private lateinit var correctAnswer: String
    private lateinit var wrongAnswer: List<String>

    /**
     * Возвращает вопрос полученный по индексу
     * @param number индекс вопрос в JSON файле
     * @return вопрос по индексу
     */
    fun getQuestion(number: Int): Question {
        questionText = JsonPath.read<String>(file, "$.questions[$number].text")
        correctAnswer = JsonPath.read<String>(file, "$.questions[$number].correct")
        wrongAnswer = JsonPath.read<List<String>>(file, "$.questions[$number].wrong")
        return this
    }

    /**
     * @return текст вопрос и ответов
     */
    override fun toString() = "text = $questionText \n" +
            "correct = $correctAnswer\n" +
            "wrong = $wrongAnswer"

    /**
     * @return рандомный вопрос
     */
    fun getRandomQuestion () =
        this.getQuestion(
            Random.nextInt(0, getNumbersOfQuestions()))

    /**
     * @return Количество вопросов в JSON файле
     */
    private fun getNumbersOfQuestions(): Int {
        return JsonPath.read<List<String>>(file, "$.questions").size
    }
}