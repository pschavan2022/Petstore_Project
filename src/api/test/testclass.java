package api.test;

import org.testng.Assert;

import api.endpoints.Routes;
import api.payloads.userpayloads;
import api.utilities.usercommonfunction;
import io.restassured.path.json.JsonPath;

public class testclass {
	public static void execute()
	{
		String baseURI= Routes.baseURI();
	    String resource= Routes.resource();
	    String requestBody=userpayloads.requestBody();
	    
	    int statusCode= usercommonfunction.statusCode(baseURI, requestBody, resource);
	    String responseBody= usercommonfunction.responsBody(baseURI, requestBody, resource);
	    
	    JsonPath jspreq = new JsonPath(requestBody);
	    	 int req_id = jspreq.getInt("id");
	         String req_username=jspreq.getString("username");
	         String req_firstname=jspreq.getString("firstName");
	         String req_lastname=jspreq.getString("lastName");
	         String req_email=jspreq.getString("email");
	         String req_password=jspreq.getString("password");
	         String req_phone=jspreq.getString("phone");
	         String req_status=jspreq.getString("status");
	          
	         JsonPath jspres= new JsonPath(responseBody);
	    	   int res_id = jspreq.getInt("id");
	    	   String res_username=jspreq.getString("username");
	    	   String res_firstname=jspreq.getString("firstName");
	    	   String res_lastname=jspreq.getString("lastName");
	    	   String res_email=jspreq.getString("email");
	    	   String res_password=jspreq.getString("password");
	    	   String res_phone=jspreq.getString("phone");
	    	   String res_status=jspreq.getString("status");
	    	   
	    	   
	    	   Assert.assertEquals(statusCode, 200);
	    	   Assert.assertEquals(res_id, req_id);
	    	   Assert.assertEquals(res_username, req_username);
	    	   Assert.assertEquals(res_firstname, req_firstname);
	    	   Assert.assertEquals(res_lastname, req_lastname);
	    	   Assert.assertEquals(res_email, req_email);
	    	   Assert.assertEquals(res_password, req_password);
	    	   Assert.assertEquals(res_phone, req_phone);
	    	   Assert.assertEquals(res_status, req_status);
	    	   
	    	   System.out.println("post response :" +responseBody);
	}

}
