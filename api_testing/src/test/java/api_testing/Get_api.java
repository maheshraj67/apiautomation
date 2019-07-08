package api_testing;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base_page.TestPage;

import client.RestClient;
import utils.TestUtil;


public class Get_api extends TestPage{
	TestPage testBase;
	String serviceUrl;
	String  apiUrl;
	String url;
	RestClient restclient;
	CloseableHttpResponse closeableHttpResponce;
	
	@BeforeMethod
	public void setUp(){
		testBase = new TestPage();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		//https://reqres.in/api/users
		
		url = serviceUrl + apiUrl;	
	}
	
	@Test
	public void test1(){
		
	}
	
	
}