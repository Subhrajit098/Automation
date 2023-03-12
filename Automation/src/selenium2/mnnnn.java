package selenium2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mnnnn {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
	List<WebElement> allsug=driver.findElements(By.className("autocomplete-results-container"));
	for(WebElement sug:allsug) 
	{
      System.out.println(sug.getText());
	}
	
	/*if(suggestion.contains("apple charger")) {
		sug.click();
		break;
	*/
      
	}
}
	

