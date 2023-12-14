package practiseRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get01 {

	public static void main(String[] args) {

		//http://localhost:3000/MyCats 
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RequestSpecification httpReq= RestAssured.given();
		
		Response resp = httpReq.get("/MyCats");
		
		System.out.println(resp.getStatusCode() + " " + resp.getStatusLine());
	}

}
