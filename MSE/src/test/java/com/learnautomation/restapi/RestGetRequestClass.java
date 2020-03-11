package com.learnautomation.restapi;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

public class RestGetRequestClass {

	
	
	//@Test
/*	public void testResponseCode()
	{
		Response resp = get("https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop/related");
		int code = resp.getStatusCode();
		
		System.out.println("status code is"+code);
		
		Assert.assertEquals(code, 200);
	}*/
	
	//rest assured with static import... need not to declare specifically
	@Test
	public void testResponseCode1()
	{
		int code = get("http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println("status code is"+code);
		
		//Assert.assertEquals(code, 200);
	}	

	
	
	
}
