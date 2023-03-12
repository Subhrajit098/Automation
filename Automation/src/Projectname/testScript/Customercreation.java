package Projectname.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project.genericLib.BaseClass;
import Project.genericLib.CommonUtility;
import Project.genericLib.DataUtility;
@Listeners(Project.genericLib.ListenerImplimentation.class)
public class Customercreation extends BaseClass
{
@Test
public void customercreation() throws EncryptedDocumentException, IOException, InterruptedException 
{
	
	int num=cu.getRandomnum(1000);
	String actualcustomer=du.getDataFromExcel("Sheet1", 0, 0);
	actualcustomer=actualcustomer+num;
	//click on task
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector("[class='title ellipsis']")).click();
	driver.findElement(By.className("createNewCustomer")).click();
	driver.findElement(By.className("newNameField")).sendKeys(actualcustomer);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();

}
}