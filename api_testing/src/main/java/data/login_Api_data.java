package data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//pojo - plain old java object
public class login_Api_data {

	String username;
	String pin;
	String overwrite;
	String deviceId;
	
	

	public login_Api_data() {

	}

	public login_Api_data(String username, String pin, String overwrite, String deviceId ) {
		this.username = username;
		this.pin = pin;
		this.overwrite=overwrite;
		this.deviceId= deviceId;
	}

	//getters and setters methods:
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getOverwrite() {
		return overwrite;
	}

	public void setOverwrite(String overwrite) {
		this.overwrite = overwrite;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


}