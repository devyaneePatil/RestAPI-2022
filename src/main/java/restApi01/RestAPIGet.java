package restApi01;

import static io.restassured.RestAssured.given;

public class RestAPIGet {
	public static void main(String[] args) {
		given().log().all()
		.when().get("https://dummy.restapiexample.com/api/v1/employee/1")
		.then().log().all();
	}
}
