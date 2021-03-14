package utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder


import java.io.File
import kotlin.random.Random

object QuestionsSets {

    var questionsSets: ArrayList<QuestionSet> = arrayListOf()
    private lateinit var file: File
    var gsonBuilder = GsonBuilder()
    var gson: Gson = gsonBuilder.create()

    /**
     * Файлы с наборами вопросов
     */
    var pathsOfSetFiles: Array<File> =
        File("src/main/resources/setOfQuestions").listFiles() ?: throw IllegalArgumentException("No question sets")

    init {
        pathsOfSetFiles.forEach {
            addSet(it.toString())
        }
    }

    /**
     * Добавляет QuestionSet из файла
     */
    fun addSet(filePath: String): QuestionsSets {
        file = File(filePath)

        questionsSets.add(
            gson.fromJson<QuestionSet>(
                file.readText(), QuestionSet::class.java
            )
        )
        return this
    }

    /**
     * @return количество сетов
     */
    fun getAmountOfQuestionSets(): Int = questionsSets.size

    /**
     * @return набор вопросов по индексу
     */
    fun getQuestionSetByIndex(index: Int): QuestionSet = questionsSets[index]

    /**
     * @return рандомный набор вопросов
     */
    fun getRandomQuestionSet() = getQuestionSetByIndex(Random.nextInt(0, getAmountOfQuestionSets()))

}