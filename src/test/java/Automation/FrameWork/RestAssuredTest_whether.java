package Automation.FrameWork;

import org.json.*;
//import org.json.JSONObject;
//import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredTest_whether 
{
  @Test
  public void getRequest() 
  {
	  RestAssured.baseURI="http://api.openweathermap.org/data/2.5/weather";
	  
	  RequestSpecification httprequest=RestAssured.given();
	  
	  Response response = httprequest.request(Method.GET, "?q=London&appid=b36fe9afeda127433d637b8558159fb0");
	  
	  String resbody=response.getBody().asString();
	  
	  //JSONObject obj1 = new JSONObject(response);
	  
	  
	  JsonPath jseval=response.jsonPath();
	  
	  System.out.println(resbody);
	  
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getStatusLine());	  
	  System.out.println(resbody.contains("stations"));	  
	  System.out.println(jseval.get("coord"));
	  System.out.println(jseval.get("weather"));
	  
	  JSONObject obj = new JSONObject(resbody);
	  double lat = obj.getJSONObject("coord").getDouble("lat");
	  System.out.println(lat);
	  
	  JSONArray jsarray = obj.getJSONArray("weather");
	  System.out.println(jsarray);
	  
	  String icon = jsarray.getJSONObject(0).getString("icon");
	  System.out.println(icon);
	  
	  
	  
  }
  
}
