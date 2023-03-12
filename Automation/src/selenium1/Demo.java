package selenium1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo
{
public static void main(String[] args) 
{
	//configure the browser server
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//launch chromebrowser
	ChromeDriver driver=new ChromeDriver();
	//open flipkart application
	driver.get("https://www.flipkart.com/");
	
}
}

