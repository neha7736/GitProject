package com.learnautomation.restapi;
 
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import static  io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class BDDStyleGetRequest {
 
	
	@Test
	public void GetBookingIds_VerifyStatusCode() {
		
		// Given
		RestAssured.given()
			.baseUri("https://restful-booker.herokuapp.com")
		// When
		.when()
			.get("/booking")
		// Then
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			// To verify booking count
			.body("bookingid.sum()", Matchers.hasSize(10))
			// To verify booking id at index 3
			.body("bookingid[3]", Matchers.equalTo(1));			
		
 
	}
 
	
	
}
