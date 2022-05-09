package restApi01;

import static io.restassured.RestAssured.given;

public class PostAssignment {
	public static void main(String[] args) {
		given().header("Content-Type", "application/json")
				.body("{\r\n" + "\r\n" + "\"name\":\"Wings Of Fire\",\r\n" + "\"isbn\":\"b9479988U\",\r\n"
						+ "\"aisle\":\"45\",\r\n" + "\"author\":\"Dr.Kalam\"\r\n" + "}\r\n" + " \r\n" + "")

				.log().all()
				.when().post("http://216.10.245.166/Library/Addbook.php")
				.then().log().all();
	}
}
