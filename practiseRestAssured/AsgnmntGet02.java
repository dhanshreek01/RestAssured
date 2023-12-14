package practiseRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AsgnmntGet02 {

	public static void main(String[] args) {
		// Req: capture status code , status line and response payload or response body, validate 
		//http://localhost:3000/MyCats
		
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httpReq = RestAssured.given();
		Response httpResp = httpReq.get("/MyCats");
		
		int code = httpResp.statusCode();
		String line = httpResp.statusLine();
		String body = httpResp.getBody().asPrettyString();
		String name = "Bundi";
		
		System.out.println(code + " is code");
		System.out.println(line + " is Line");
		
		if(body.contains(name))
		{
			System.out.println("Test is Passed! ");
		}else
		{
			System.out.println("Test is Failed! ");
		}
		

	}

}
