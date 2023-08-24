package in.Restassured.pages;

import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class sportyshoes {

	HashMap<String, String> map = new HashMap<String, String>();
	
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority=1)
	
	public void verifyResource() {
	
	RestAssured
.given()
.contentType("application/json")
.when()
	.get("http://localhost:9010/get-shoes")
	.then()
	.statusCode(200)
     .log().all();
	}

@Test(priority=2)
	
public void verifyResource1() {
	
	RestAssured
.given()
.contentType("application/json")
.when()
	.get("http://localhost:9010/get-user")
	.then()
	.statusCode(404)
     .log().all();
}

@Test(priority=3)

public void verifyResource2() {
	
	RestAssured
.given()
.contentType("application/json")
.when()
	.get("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
	.then()
	.statusCode(405)
     .log().all();
}
}
