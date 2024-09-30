package testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.TestUtil;

import pojo.Get_Place;
import pojo.Get_ZipData;
import requests.GetRequest;

@Listeners(utils.ExtentTestNGListener.class)
public class Get_TestCases {
	
	GetRequest getRequest;
	Get_ZipData zipData;
	
	@Test(priority = 1)
	public void testGetRequest_Direct() {
		
		getRequest = new GetRequest();
		
		zipData = getRequest.getZipDetails("in", "670307");
		
		String countryName = zipData.getCountry();
		
		List<Get_Place> placesList = zipData.getPlaces();
		String placeName = "";
		String stateName = "";
		for (Get_Place pl : placesList) {
			placeName = pl.getPlace_name();
			stateName = pl.getState();			
		}
		
		System.out.println(countryName + " " + stateName + " " + placeName);
		Assert.assertTrue(true);
	}
	
	@DataProvider
	public Object[][] testGetRequest_TestData(){
		return TestUtil.getTestData("Zippopotam");
	}
	
	@Test(priority = 2, dataProvider = "testGetRequest_TestData")
	public void testGetRequest_Excel(String country, String zip) {
		
		getRequest = new GetRequest();
		
		zipData = getRequest.getZipDetails(country, zip);
		
		String countryName = zipData.getCountry();
		
		List<Get_Place> placesList = zipData.getPlaces();
		String placeName = "";
		String stateName = "";
		for (Get_Place pl : placesList) {
			placeName = pl.getPlace_name();
			stateName = pl.getState();			
		}
		
		System.out.println(countryName + " " + stateName + " " + placeName);		
	}

}