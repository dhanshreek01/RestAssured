package api.Rest.Assured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post01 {

	public static void main(String[] args) {
		// Verify Status code and status Line:
		
		RestAssured.baseURI= "http://localhost:3000";
		RequestSpecification httpReq = RestAssured.given();
		httpReq.header("Content-Type", "application/json");
		
		
		JSONObject jBody = new JSONObject();
		
		jBody.put("fname", "Rowdy");
		jBody.put("lname", "meeow");
		jBody.put("address", "karnataka");
		jBody.put("emailId", "RowdyMeow@gmail.com");

		httpReq.body(jBody.toString());
		
		Response httpResp = httpReq.post("/MyCats");
		
		System.out.println(httpResp.getStatusCode());
		System.out.println(httpResp.statusLine());

	}

}
