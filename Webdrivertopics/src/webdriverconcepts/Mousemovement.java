 package webdriverconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement 
{
	public static void main(String []args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.services.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Create an object of action class & pass driver as an argument
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//a[text()='Hotels']"));
		//call moveToElement() & pass webelement & call perform() to complete the action
		act.moveToElement(menu).perform();
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on submenu in drop down menu
		driver.findElement(By.linkText("Hotels & Lounge")).click();
	}
}
