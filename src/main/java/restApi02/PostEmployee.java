package restApi02;
import static io.restassured.RestAssured.given;

public class PostEmployee {
public static void main(String[] args) {
	given().header("Content-Type", "application/json")
	.body("{" + "    \"name\": \"Devyanee Nemade\"," +
			  "    \"salary\": \"50000\","  + "\"age\": \"29\"" + "}")
			  
	.log().all()
	.when().post("https://dummy.restapiexample.com/api/v1/create")
	.then().log().all();
}
}
