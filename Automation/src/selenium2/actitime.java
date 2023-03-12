package selenium2;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class actitime 
	{
	
		
	public static void main(String[] args) throws InterruptedException 
	{
		Random R=new Random();
		int num=R.nextInt(5000);
		String actualcustomer_name="vivek";
		actualcustomer_name=actualcustomer_name+num;
	
		String expcustomername1 =actualcustomer_name;
	     System.out.println(expcustomername1);
		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
			driver.findElement(By.id("loginButton")).click();
		
			driver.findElement(By.id("container_tasks")).click();
			
			driver.findElement(By.cssSelector("[class='title ellipsis']")).click();
			
			driver.findElement(By.className("createNewCustomer")).click();
		
			driver.findElement(By.className("inputNameField")).sendKeys(actualcustomer_name);
			
			driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("hi my name is vivek");
		
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//	wait.until(null)

			String expcustomername11=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
			System.out.println(expcustomername11);

		    if(expcustomername11.equals(actualcustomer_name))
		    {
			System.out.println("Test case passed");
		    }
		    else 
		    	System.out.println("Test case failed");
			
			
		
		
		
	}
	}



