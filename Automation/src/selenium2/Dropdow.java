package selenium2;
//go to actitime click on setting click on  general setting on top grouping level(drop down)  select product line,and check that weather its a sinle select or multi select
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdow 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
    driver.findElement(By.className("popup_menu_button_settings")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
    WebElement dropdo=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
    Select sel= new Select (dropdo);
    sel.selectByVisibleText("Product Line");
   if(sel.isMultiple()) {
	   System.out.println("its multidropdown select");
   }
   else 
	   System.out.println("its a single dropdown select");
}
}
