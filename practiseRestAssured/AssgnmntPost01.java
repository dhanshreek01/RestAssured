package practiseRestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AssgnmntPost01 {

	public static void main(String[] args) {
		// post
		
		
				JSONObject jBody = new JSONObject();
				jBody.put("Fname" , "Bharath");
				jBody.put("Address" , "karnatka");
				jBody.put("Hobby", "sports");
				jBody.put("phNo", "12345678");
				
				
				RestAssured.baseURI = "http://localhost:3000";

				Response httpResp = 
						RestAssured
						.given()
						.header("Content-Type","application/json")
						.body(jBody)
						.post("/MyCats");
					//	.then().log().all().extract().response();	
				
				
				JsonPath jPath = new JsonPath(jBody.toString());
				
				String b =jPath.get("Fname");
				System.out.println(b);

			System.out.println(	httpResp.getStatusCode());
			System.out.println(	httpResp.getStatusLine());
	}

}
