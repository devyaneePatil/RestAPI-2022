package restApi02;

import static io.restassured.RestAssured.given;

public class DeleteEmployeeRecord {
	public static void main(String[] args) {
		given().log().all()
		.when().delete("https://dummy.restapiexample.com/api/v1/delete/21").
		then().log().all();
	}

}
