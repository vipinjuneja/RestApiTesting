package Automation.FrameWork;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredTestCases 
{
  @Test
  public void getRequest() 
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  
	  RequestSpecification httprequest=RestAssured.given();
	  
	  Response response = httprequest.request(Method.GET, "/Hyderabad");
	  
	  String resbody=response.getBody().asString();
	  
	  JsonPath jseval=response.jsonPath();
	  
	  System.out.println(resbody);
	  
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getStatusLine());
	  
	  System.out.println(resbody.contains("Hyderabad"));

	  
	  System.out.println(jseval.get("City"));
	  System.out.println(jseval.get("Temperature"));

	  
  }
  
  @Test
  public void postRequest()
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/customer";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams=new JSONObject();
	  requestparams.put("FirstName", "jaaneman123"); // Cast
	  requestparams.put("LastName", "mahashya123");	   
	  requestparams.put("UserName", "simpjkdfhvb987123");
	  requestparams.put("Password", "pass12345word1123");
	  requestparams.put("Email",  "somewe4user876123@gmail.com");
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  Response response=httprequest.post("/register");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getBody().asString());
  }
  
  @Test
  public void postRequest1()
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/customer";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams=new JSONObject();
	  requestparams.put("FirstName", "vipin");
	  requestparams.put("LastName", "juneja");	   
	  requestparams.put("UserName", "simpleuser001");
	  requestparams.put("Password", "password1");
	  requestparams.put("Email",  "someuser@gmail.com");
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  Response response=httprequest.get("/register");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getBody().asString());
  }
  
  @Test
  public void postRequest2()
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/customer";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams=new JSONObject();
	  requestparams.put("LastName", "juneja");	   
	  requestparams.put("UserName", "simpleuser001");
	  requestparams.put("Password", "password1");
	  requestparams.put("Email",  "someuser@gmail.com");
	  requestparams.put("Email8768976",  "7458someuser@gmail.com");
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  Response response=httprequest.get("/register");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getBody().asString());
  }
  
  
}
