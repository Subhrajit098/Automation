package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class selugoo {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.selenium.dev/");
		driver.get("https:www.google.co.in/");
		driver.close();
		
	}

}
