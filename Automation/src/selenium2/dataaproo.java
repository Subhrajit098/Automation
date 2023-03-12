package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataaproo {
	@Test(dataProvider="datasupplier")
	public void data(String username,String pwd) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		 
	}
	
	@DataProvider
	public Object[][] datasupplier(){
	Object[][] objar=new Object[4][2];
	objar[0][0]="admin";
	objar[0][1]="manager";
	objar[1][0]="admin1";
	objar[1][1]="manager1";
	objar[2][0]="admin2";
	objar[2][1]="manager2";
	objar[3][0]="admin3";
	objar[3][1]="manager3";
	return objar;
}
}