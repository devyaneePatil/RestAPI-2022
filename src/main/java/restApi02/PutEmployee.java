package restApi02;
import static io.restassured.RestAssured.given;
public class PutEmployee {
public static void main(String[] args) {
	given().header("Content-Type", "application/json")
	.header("Authorization", "Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
	.body("{\"name\":\"Akshay\",\"salary\":\"50000\",\"age\":\"23\"}")
	.log().all()
	.when().post("https://dummy.restapiexample.com/api/v1/create")
	.then().log().all();
}
}
