package post_put_patch_delete;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

//We need to add "JSON Object" = It will allow us to add data in JSON format

public class Post_Delete_PutExample {

	@Test
	
	public void test1() {
		
		RequestSpecification request = RestAssured.given();
		
		
		request.header("Content-Type", "application/json"); // header having key value pair
		
// to send the data we will use JSONObject
		
		JSONObject json = new JSONObject();
		json.put("id", "21");
		json.put("title", "selenium");
		json.put("author", "Keats");
		

//now we will send the Body part
		
request.body(json.toJSONString());

// We need to post the url

Response response = request.post("http://localhost:3000/posts");

int code =response.getStatusCode();

Assert.assertEquals(code, 201);
	} 
	
	
	
}
