package utils

import java.io.File
import kotlin.random.Random

object QuestionsSets {
    const val FOLDER: String ="src/main/resources/setOfQuestions/"

    /**
     * Файлы с наборами вопросов
     */
    var setOfQuestions: Array<File> =
        File("src/main/resources/setOfQuestions").listFiles() ?: throw IllegalArgumentException("No question sets")

    /**
     * @return количество наборов с вопросами
     */
    fun getAmountOfQuestionSets(): Int = setOfQuestions.size

    /**
     * @return набор вопросов по индексу
     */
    fun getQuestionSetByIndex(index: Int): QuestionSet {

        QuestionSet.fileName = setOfQuestions[index].name

        return QuestionSet
    }

    /**
     * @return рандомный набор вопросов
     */
    fun getRandomQuestionSet() = getQuestionSetByIndex(Random.nextInt(0, getAmountOfQuestionSets()))
}