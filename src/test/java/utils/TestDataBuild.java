package utils;

import java.util.ArrayList;
import java.util.List;

import pojo.Post_AddPlace;
import pojo.Post_Location;

// For POST Request
public class TestDataBuild {
	
	public Post_AddPlace addPlacePayload(String name, String language, String address) {
		
		Post_AddPlace pa = new Post_AddPlace();
		pa.setAccuracy(50);
		pa.setName(name);	// Note
		pa.setAddress(address); // Note
		pa.setPhone_number("(+91) 123 456 6789");
		pa.setWebsite("http://google.com");
		pa.setLanguage(language);	// Note
		
		List <String> typesList = new ArrayList<String>();	// Using ArrayList as we need to pass array of values
		typesList.add("shoe park");
		typesList.add("shop");		
		pa.setTypes(typesList);
		
		Post_Location loc = new Post_Location();
		loc.setLat(-43.383494);
		loc.setLng(43.427362);
		pa.setLocation(loc);
		
		return pa;
		
	}
	

}