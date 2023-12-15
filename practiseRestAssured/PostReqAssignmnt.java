package practiseRestAssured;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostReqAssignmnt {

	public static void main(String[] args) {
		//post status code status line capture id 
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Bharath", "Karnataka");
		map.put("Gabru", "Pune");
		map.put("Tanu", "Pune");
		map.put("Bundi", "Meow");
		map.put("sakha", "mumbai");
		map.put("basundi", "ramdara");
		
		
		JSONObject jBody = new JSONObject();
		jBody.putAll(map);
		
		RestAssured.baseURI = "http://localhost:3000";
		
		Response httpResp =
				RestAssured
				.given()
				.contentType("application/json")
				.body(jBody)
				.post("/MyCats");
		
		System.out.println(httpResp.statusCode() + "= code");
		System.out.println(httpResp.statusLine() + "=Status Line");
		
		String body = httpResp.getBody().asPrettyString();
		
		JsonPath jPath = new JsonPath(body);
		String fname = jPath.get("Tanu");
		System.out.println(fname);
		
        int capturedId = jPath.getInt("id");
        System.out.println(capturedId + "=id");
        

	}

}
