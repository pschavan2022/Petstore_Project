package api.endpoints;

public class Routes {
	public static String baseURI()
	{
		String baseURI="https://petstore.swagger.io/v2";
				return baseURI;
	}
	public static String resource()
	{
		String resource="/user";
		return resource;
	}
	public static String resource1()
	{
		String resource="user/logout";
		return resource;
	}
	

}
