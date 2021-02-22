import com.jayway.jsonpath.JsonPath
import java.io.File

fun main() {
    var file = File("src/main/resources/themes/forTest.json")


    print(

    JsonPath.read<String>(file, "$..name")


    )
}
