package api.utilities;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class usercommonfunction {
	public static int statusCode(String baseURI,String requestBody,String resource)
	{
		RestAssured.baseURI=baseURI;
		int statusCode=given()
				.contentType(ContentType.JSON)
				   .accept(ContentType.JSON)
				   .body(requestBody)
				   .when()
				   .post(resource)
				   .then()
				   .extract()
				   .statusCode();
		return statusCode;
	}
	public static String responsBody(String baseURI,String requestBody,String resource)
	{
		RestAssured.baseURI=baseURI;
		String responsBody=given()
				.contentType(ContentType.JSON)
				   .accept(ContentType.JSON)
				   .body(requestBody)
				   .when()
				   .post(resource)
				   .then()
				   .extract()
				   .response()
				   .asString();
		return responsBody;
	}
	public static String responsBody1(String baseURI,String resource1)
	{
		RestAssured.baseURI=baseURI;
		String responsBody=given().header("accept","application/json")
				   .when()
				   .get(resource1)
				   .then()
				   .extract()
				   .response()
				   .asString();
		return responsBody;
	}
	public static int statusCode1(String baseURI,String resource1)
	{
		RestAssured.baseURI=baseURI;
		int statusCode=given().header("accept","application/json").when().get(resource1).then().extract().statusCode();		   
		return statusCode;
	}
	

}
