package Projectname.testScript;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Project.genericLib.BaseClass;
import Project.genericLib.CommonUtility;
import Project.genericLib.DataUtility;

//go to actitime login 
//click on settings then click on types of work
//then click on create types of works pass name in name text field then click on cancel 
//then handle the alert popup fetch the msg then click on ok
public class Alerthandle extends BaseClass
{
	@Test
	public void Alerthan() throws IOException {
	
	driver.findElement(By.className("popup_menu_button_settings")).click();
	driver.findElement(By.linkText("Types of Work")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	String work=du.getDataFromExcel("Sheet1", 3, 0);
	driver.findElement(By.id("name")).sendKeys(work);
	driver.findElement(By.cssSelector("[onclick='handleCancel();']")).click();
	String msg=cu.getAlertmsg(driver);
	System.out.println(msg);
	cu.Alertok(driver);
	
	
	
}
}
