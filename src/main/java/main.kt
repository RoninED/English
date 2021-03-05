import utils.Question

fun main() {
    var count:Int
    var answers: List<String>

    while (true) {
        Question.getRandomQuestion()

        println(Question.questionText)

        answers = Question.mixOfAnswers()

        count = 1
        answers.forEach{
            println("${count++} - $it")
        }

        print("Выберите вариант:")

        if (answers[readLine()!!.toInt()-1].equals(Question.correctAnswer)) println("Верно\n")
        else println("Ошибка\n")

    }
}

