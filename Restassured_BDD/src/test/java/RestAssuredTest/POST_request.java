package RestAssuredTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_request {

	public static HashMap map = new HashMap();      //hashmap object in java so that
												//store multiple value in "map"
	
	@BeforeClass
	public void POSTdata() {
	
		map.put("name",Rest_utils.getName());
		map.put("name",Rest_utils.getEmail());
		map.put("name",Rest_utils.getGender());
		map.put("name",Rest_utils.getStatus());
		
		RestAssured.baseURI ="https://gorest.co.in/public-api/";
		RestAssured.basePath="/users";

	}
	
	@Test
	public void testPost() {
		
		RestAssured.given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201);
		
		
	}
	
}
