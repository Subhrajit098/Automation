package Project.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility
{
	Alert alt;
public int getRandomnum(int value) 
{
	Random r=new Random();
	int num=r.nextInt();
	return num;
}
public void Selectbyvisibletext(WebElement wbname,String value) 
{
Select se=new Select(wbname);
se.selectByVisibleText(value);
}
public void Selectbyvalue(WebElement wbname,String value)
{
	Select se=new Select(wbname);
	se.selectByValue(value);
}
public void SelectbyIndex(WebElement wbname,int value)
{
	Select se=new Select(wbname);
	se.selectByIndex(value);
}
public void Alertok(WebDriver driver) 
{
	alt=driver.switchTo().alert();
	alt.accept();
}
public void getAlertcancel(WebDriver driver) 
{
	alt=driver.switchTo().alert();
	alt.dismiss();
}
public String getAlertmsg(WebDriver driver) 
{
    alt=driver.switchTo().alert();
	String msg=alt.getText();
	return msg;
}
}
