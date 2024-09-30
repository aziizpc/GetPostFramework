package requests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Listeners;

import io.restassured.RestAssured;
import pojo.Get_ZipData;

public class GetRequest {
	
	public Get_ZipData getZipDetails(String country, String zip) {
		
		RestAssured.baseURI = "http://api.zippopotam.us";
		
		Get_ZipData zipData = 
				given()
					.pathParam("countryCode", country)
					.pathParam("zipCode", zip)
				.when()
					.get("/{countryCode}/{zipCode}")
				.then()
					.log().all()
					.assertThat()
						.statusCode(200)
					.extract().as(Get_ZipData.class);
		
		return zipData;
		
	}	

}