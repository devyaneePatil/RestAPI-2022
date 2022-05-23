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