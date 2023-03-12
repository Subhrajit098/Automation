package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazontitle 
{
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.netflix.com/");
String url=driver.getCurrentUrl();
System.out.println(url);
String sourcecode=driver.getPageSource();
System.out.println(sourcecode);
String Title=driver.getTitle();
System.out.println(Title);

	
}
}
