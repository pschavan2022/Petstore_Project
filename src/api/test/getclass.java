package api.test;

import org.testng.Assert;

import api.endpoints.Routes;
//import api.payloads.userpayloads;
import api.utilities.usercommonfunction;
import io.restassured.path.json.JsonPath;

public class getclass {
	public static void execute1()
	{
		String baseURI=Routes.baseURI();
	    String resource=Routes.resource1();
	    
	    
	    int statusCode= usercommonfunction.statusCode1(baseURI,resource);
	    String responseBody= usercommonfunction.responsBody1(baseURI,resource);
	    
	    JsonPath jsp=new JsonPath(responseBody);
	    int res_code=jsp.getInt("code");
	    String res_message=jsp.getString("message");
	    String res_type=jsp.getString("type");
	    
	    Assert.assertEquals(statusCode,200);
	    Assert.assertNotNull(res_type);
	    Assert.assertNotNull(res_code);
	    Assert.assertNotNull(res_message);
	    System.out.println("get response  :" +responseBody);
	}

}
