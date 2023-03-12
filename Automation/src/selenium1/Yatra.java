package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.yatra.com/");
	 String sourcecode=driver.getPageSource();
	 System.out.println(sourcecode);
	 driver.close();
	
}
}
