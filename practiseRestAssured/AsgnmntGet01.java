package practiseRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AsgnmntGet01 {

	public static void main(String[] args) {
		// Req: capture status code , status line and response payload or response body
       //http://localhost:3000/MyCats
		
		RestAssured.baseURI= "http://localhost:3000";
		RequestSpecification httpReq = RestAssured.given();
		Response httResp = httpReq.get("/MyCats");
		
		System.out.println("Status code : " + httResp.statusCode());
		System.out.println("Status Line : " + httResp.statusLine());
		System.out.println("Response Paylaod : " + httResp.getBody().asPrettyString()); //or asString()

	}

}
