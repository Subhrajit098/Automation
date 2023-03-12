
package selenium1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeC {

public static void main(String[] args) throws InterruptedException 
{
	Random r=new Random();//random class 
	int num=r.nextInt(1000);//creating nextInt here to take the value in the range to make unique 
	String actualcustomerName="vivek";//here we declare the actualcustomerName 
	actualcustomerName=actualcustomerName+num;// here we reintialize the actualcustomerName value
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("container_tasks")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[class='title ellipsis']")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("createNewCustomer")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("inputNameField")).sendKeys(actualcustomerName);
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("hi my name is vivek");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	Thread.sleep(1000);
	String expcustomer_name=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();//change here by using forward traversing
	System.out.println(expcustomer_name);

	    if(expcustomer_name.equals(actualcustomerName))
	    {
		System.out.println("Test case passed");
	    }
	    else 
	    	System.out.println("Test case failed");
	

}
}
