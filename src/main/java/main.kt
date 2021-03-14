import utils.CommonUtils
import utils.QuestionsSets

fun main() {

CommonUtils.askRandomQuestions()
//    testSomething()
}


/**
 * Для тестирования при разработке
 */
fun testSomething() {


//    while (true) {
        println(
            QuestionsSets.getRandomQuestionSet().getRandomQuestion().toString()

        )
//    }


//    println(
//        File("src/main/resources/setOfQuestions/testQuestions.json").readText()
//    )

//    var str = "{\n" +
//            "  \"questions\": [\n" +
//            "    {\n" +
//            "      \"text\": \"1.11 text\",\n" +
//            "      \"correct\": \"1.1 correct\",\n" +
//            "      \"wrong\": [\n" +
//            "        \"1.1 wrong 1\",\n" +
//            "        \"1.1 wrong 2\",\n" +
//            "        \"1.1 wrong 3\"\n" +
//            "      ],\n" +
//            "      \"theme\": \"testTheme1.1\",\n" +
//            "      \"tagTheme\": \"testThemeTag1.1\",\n" +
//            "      \"progress\": 0\n" +
//            "    },\n" +
//            "    {\n" +
//            "      \"text\": \"1.2 text\",\n" +
//            "      \"correct\": \"1.2 correct\",\n" +
//            "      \"wrong\": [\n" +
//            "        \"1.2 wrong 1\",\n" +
//            "        \"1.2 wrong 2\",\n" +
//            "        \"1.2 wrong 3\"\n" +
//            "      ],\n" +
//            "      \"theme\": \"testTheme1.1\",\n" +
//            "      \"tagTheme\": \"testThemeTag1.1\",\n" +
//            "      \"progress\": 0\n" +
//            "    }\n" +
//            "  ]\n" +
//            "}"
//
//    var gsonBuilder = GsonBuilder()
//    var gson: Gson = gsonBuilder.create()
//    var t = gson.fromJson<QuestionSet>(str,QuestionSet::class.java)
//
//    println(t.questions.get(0).text)


//    var qs: QuestionSet = QuestionSet(
//        arrayListOf(
//            Question(
//                "text1",
//                "r",
//                listOf("w", "w"),
//                "textTheme1",
//                "tag1",
//                0
//
//            )
//        )
//    )
//
//    var gsonBuilder = GsonBuilder()
//    var gson: Gson = gsonBuilder.create()
//    var t = gson.toJson(qs)
//
//    println(t)

}









