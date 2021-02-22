import com.jayway.jsonpath.JsonPath;

public class t {
    public static void main(String[] args) {
        String jsonHiWorld = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";
        System.out.println(jsonHiWorld);

        String message = JsonPath.read(jsonHiWorld, "$.message");
        String place = JsonPath.read(jsonHiWorld, "$.place.name");
        System.out.println(message + " " + place); // напечатает "Hi World!"
    }


}
