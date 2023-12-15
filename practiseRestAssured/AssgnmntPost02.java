package practiseRestAssured;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AssgnmntPost02 {

	public static void main(String[] args) {
		// POst and all type of Verification
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Fname", "Bharath");
		map.put("Lname", "Gabru");
		map.put("Mname", "Sakha");
		map.put("Pname", "Tanu");
		
		
		JSONObject jBody = new JSONObject();
		jBody.putAll(map);
		
		RestAssured.baseURI= "http://localhost:3000";
		
		Response httpResp = 
				RestAssured
				.given()
				.header("Content-Type","application/json")
				.body(jBody)
				.post("/MyCats");
		
	int code=	httpResp.statusCode();
	String Line = 	httpResp.statusLine();
	String type =	httpResp.contentType();
	    String body =	httpResp.getBody().asString();
	    
	    System.out.println(code + "\n " + Line + "\n" + type + "\n"+ body);
	    JsonPath jPath = new JsonPath(body);
	    
	   System.out.println( jPath.get("Fname").toString());
		

	}

}
