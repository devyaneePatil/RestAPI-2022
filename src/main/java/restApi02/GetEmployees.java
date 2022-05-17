package restApi02;

import static io.restassured.RestAssured.given;

public class GetEmployees {
	public static void main(String[] args) {
		given().log().all()
	  
	
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		.then().log().all();
		
		
		
		
	}
}
 