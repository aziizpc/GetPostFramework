package pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Get_ZipData {
	
	@JsonProperty("post code")
	public String post_code;
	
    public String country;
    
    @JsonProperty("country abbreviation")
    public String country_abbreviation;
    
    public List<Get_Place> places;
    
	public String getPost_code() {
		return post_code;
	}
	
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry_abbreviation() {
		return country_abbreviation;
	}
	
	public void setCountry_abbreviation(String country_abbreviation) {
		this.country_abbreviation = country_abbreviation;
	}
	
	public List<Get_Place> getPlaces() {
		return places;
	}
	
	public void setPlaces(List<Get_Place> places) {
		this.places = places;
	}

}