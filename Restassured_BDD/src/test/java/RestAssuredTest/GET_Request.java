package RestAssuredTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class GET_Request {
		
		@Test
		public void GetUserDetails()
		{
			RestAssured.given()
			.when()
			.get("https://gorest.co.in/public-api/users/6")
			.then()
			.statusCode(200)
			.assertThat()
			.body("data.name", equalTo("Chandira Kaniyar VM"))
			.header("Content-Type", "application/json; charset=utf-8");
			
//			RequestSpecification httpRequest = RestAssured.given();
//			Response response = httpRequest.get("/Hyderabad");
//			JsonPath jsonPathEvaluator = response.jsonPath();
//			String name = jsonPathEvaluator.get("Chandira Kaniyar VM");
//			System.out.println("City received from Response " + name);
	
  }
}
