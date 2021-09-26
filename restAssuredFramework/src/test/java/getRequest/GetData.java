package getRequest;



import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; // means you do not have to explicitly give method names
import io.restassured.response.Response;






public class GetData {

	
	
	@Test
	public void testResponseCode() {
		
//ResAssured is a class in RestAssured Framework which has different method to perform diff actionsw
		//RestAssured data = new RestAssured();
		
		//will get the response back when passed the url
		/*
		 * Response response = get("http://restcountries.eu/rest/v1/name/norway");
		 * 
		 * 
		 * int code = response.getStatusCode();
		 * 
		 * System.out.println("Status Code is " + code);
		 * 
		 * Assert.assertEquals(code, 200);
		 */	
		
Response response = get("http://restcountries.eu/rest/v1/name/norway");
		
		
		int code = get("http://restcountries.eu/rest/v1/name/norway").getStatusCode();
		
		System.out.println("Status Code is " + code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	

	@Test
	public void testResponseBody() {
		
/*		
		//will get the complete response back 
		Response response = get("http://restcountries.eu/rest/v1/name/india");
		
//"asString" will give us the data in complete String format		
		String body = response.asString();
		
		System.out.println("Status Code is " + body);

	*/
		

		//will get the complete response back 
String body = get("http://restcountries.eu/rest/v1/name/india").asString();
		
		System.out.println("Status Code is " + body);

		Long time = get("http://restcountries.eu/rest/v1/name/india").getTime();
		System.out.println("Response Time is := " + time);
		
	}	
	

/*
 *Note :=> if we are not using "import static io.restassured.RestAssured.* instead using only
 *import io.restassured.RestAssured.assure; 	
 *Then we have to implicitly specify "RestAssured" class name before using its Methods. 
 * 	
	@Test
	public void testResponseCode() {
		
//ResAssured is a class in RestAssured Framework which has different method to perform diff actionsw
		//RestAssured data = new RestAssured();
		
		//will get the response back when passed the url
		Response response = RestAssured.get("http://restcountries.eu/rest/v1/name/norway");
		
		
		int code = response.getStatusCode();
		
		System.out.println("Status Code is " + code);
		
		Assert.assertEquals(code, 200);
		
	}
	
	

	@Test
	public void testResponseBody() {
		
		
		//will get the complete response back 
		Response response = RestAssured.get("http://restcountries.eu/rest/v1/name/india");
		
//"asString" will give us the data in complete String format		
		String body = response.asString();
		
		System.out.println("Status Code is " + body);
		
		
	}	

 * 
 * 	
 */
	
	
	
	
	
}
