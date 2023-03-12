package Projectname.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Project.genericLib.BaseClass;

public class DropHandle extends BaseClass
{
@Test
public void selectgroup() 
{
	    driver.findElement(By.className("popup_menu_button_settings")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
	    WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	    cu.Selectbyvisibletext(dropdown, "Product Line");
	    String text=driver.findElement(By.id("FormModifiedTextCell")).getText();
	    Reporter.log(text,true);
}
}
