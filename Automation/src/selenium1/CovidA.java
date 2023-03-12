package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidA 
{
	ChromeDriver driver;
	public static void main(String[] args)
	{
		
		CovidA ca=new CovidA();
		ca.launchBrowser();
		ca.login();
		ca.total_cases();
		ca.recovery_cases();
		ca.death_cases();
		
	}
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	public void login()
	{
		driver.get("https://www.worldometers.info/coronavirus/");
	}
	public void total_cases() 
	{
	String cases_no=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
	System.out.println("total no. of covid cases: "+cases_no); 
	}
	public void recovery_cases() 
	{
		String recover_case=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		System.out.println("total no of recovery: "+recover_case);
	}
	public void death_cases() 
	{
	String death_case=	driver.findElement(By.xpath("//h1[text()='Recovered:']/../div/span")).getText();
	System.out.println(" total no of death: "+death_case);
	}
}
