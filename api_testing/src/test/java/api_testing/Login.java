package api_testing;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base_page.TestPage;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import data.Users;
import data.login_Api_data;
import client.RestClient;

public class Login extends TestPage{
	TestPage testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closebaleHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		testBase = new TestPage();
		serviceUrl = prop.getProperty("URL1");
		apiUrl = prop.getProperty("serviceURL1");
		//https://reqres.in/api/users
		
		url = serviceUrl + apiUrl;
		
	}
	
	
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		//Users users = new Users("Mahesh", "Superman"); //expected users object
		
		login_Api_data log = new login_Api_data("7777027702", "1234", "1", "mahjeu1");
		
		//object to json file:/Users/bhuva/Mahesh/api_testing/src/main/java/data/json file name
		mapper.writeValue(new File("/Users/bhuva/Mahesh/api_testing/src/main/java/data/login.json"), log);
		
		//java object to json in String:
		String usersJsonString = mapper.writeValueAsString(log);
		System.out.println(usersJsonString);
		
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API
		
		//validate response from API:
		//1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_200);
		
		//2. JsonString:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);
		
		//json to java object:
		//Users usersResObj = mapper.readValue(responseString, Users.class); //actual users object
		//System.out.println(usersResObj);
		
		//Assert.assertTrue(log.getUsername().equals(usersResObj.getName()));
		
		//Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));
		
		//System.out.println(usersResObj.getId());
		//System.out.println(usersResObj.getCreatedAt());
		
	}
	
	
	
	
	
	
	

}