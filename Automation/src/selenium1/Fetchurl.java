package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchurl 
{
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String url=driver.getCurrentUrl();
    System.out.println(url);	
}
}
