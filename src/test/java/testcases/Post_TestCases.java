package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import requests.PostRequest;
import utils.TestUtil;

@Listeners(utils.ExtentTestNGListener.class)
public class Post_TestCases {
	
	PostRequest postRequest;
	
	@Test
	public void testPostRequest_Direct() {		
		postRequest = new PostRequest();		
		String output = postRequest.addPlace("SA", "English", "India");		
	
		JsonPath js = TestUtil.getJsonPath(output);		
		System.out.println("This is the status: " + js.getString("status")); 
		
	}
	
	

}