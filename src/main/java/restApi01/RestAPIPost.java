package restApi01;

import static io.restassured.RestAssured.given;

public class RestAPIPost {
	public static void main(String[] args) {
		given().header("Content-Type", "Application/json")
				.header("Authorization", "Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
				.body("{\"name\":\"Devyanee\",\"salary\":\"30\",\"age\":\"23\"}").log().all()
				.when()
				.post("https://dummy.restapiexample.com/api/v1/create")
				.then().log().all();
	}
}
