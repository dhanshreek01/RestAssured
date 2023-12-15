package practiseRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRqAssgnmnt {

	public static void main(String[] args) {
		//delete status code status line

		RestAssured.baseURI ="http://localhost:3000";
		
		Response httpResp = 
				RestAssured
				.given()
				.delete("/MyCats/20");
		
		System.out.println(httpResp.getStatusCode());
		System.out.println(httpResp.statusLine());
	}

}
