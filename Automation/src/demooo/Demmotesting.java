package demooo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demmotesting {
	
@BeforeSuite	
public void connectServer() 
{
	System.out.println("server connected");
}
@BeforeTest
public void connectDB() 
{
	System.out.println("DB connected");
}
@BeforeClass
public void launchBrowser()
{
	System.out.println("Launch the browser");
}
@BeforeMethod
public void login()
{
	System.out.println("login to the application");
}
@Test
public void createCustomer()
{
	System.out.println("customer created");
}
@Test
public void createProduct()
{
System.out.println("Product created");	
}

@AfterMethod
public void logout()
{
	System.out.println("logout  from the customer");
}
@AfterClass
public void closeBrowser()
{
	System.err.println("browser closed");
	
}
@AfterTest
public void closeDB() 
{
	System.out.println("Db closed");
}
@AfterSuite
public void closeServer()
{
	System.out.println("server closed");
}

}
