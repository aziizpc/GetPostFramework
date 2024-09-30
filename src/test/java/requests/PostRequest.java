package requests;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import pojo.Get_ZipData;
import utils.TestDataBuild;

public class PostRequest {
	
	TestDataBuild testData = new TestDataBuild();
	
	public String addPlace(String name, String language, String address) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String output = 
		
		given()
			.body(testData.addPlacePayload(name, language, address))
		.when()
			.post("/maps/api/place/add/json")
		.then()
			.log().all()
			.assertThat()
				.statusCode(200)
			.extract().asString();
		
		return output;
		
	}

}
