package practiseRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetReqAssignmnt {

	public static void main(String[] args) {
		// get  status code status line

		RestAssured.baseURI = "http://localhost:3000"; 
		
		Response httpResp =
				RestAssured
				.given()
				.get("/MyCats");
				//.then()
				//.log().all().extract().response();
		
		System.out.println(httpResp.getStatusCode());
		System.out.println(httpResp.getStatusLine());
	}

}
