package data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//pojo - plain old java object
public class Setting_api_data {

	String api_key;
	
	
	

	public Setting_api_data() {

	}

	public Setting_api_data(String name ) {
		this.api_key = api_key;
		
	}

	
	//getters and setters methods:
	

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	
	
	
	

}