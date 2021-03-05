import com.jayway.jsonpath.JsonPath
import java.io.File

fun main() {

    println(
        Question.getRandomQuestion().toString()
    )



//     var file = File("src/main/resources/questions/testQuestion.json")
//
//
//        var ja = JsonPath.read<List<String>>(file, "$.questions[1]..wrong")
//
//    println(ja)

}




//var file = File("src/main/resources/themes/forTest.json")
//
//
//println(
//JsonPath.read<String>(file, "$..name")
//)
//
//println(
//JsonPath.read<String>(file, "$.tool.jsonpath.creator.name")
//)