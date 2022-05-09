package restApi01;

import static io.restassured.RestAssured.given;

public class GetAssignment {

	public static void main(String[] args) {
		given()
				.log().all()
				.when().post("http://216.10.245.166/Library/GetBook.php?AuthorName=Kalam")
				.then().log().all();
	}
}
//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