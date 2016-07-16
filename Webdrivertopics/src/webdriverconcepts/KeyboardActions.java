package webdriverconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.services.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Create an object of action class & pass driver as an argument
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//a[text()='Hotels']"));		
		//perform right click action on the menu
		act.contextClick(menu).perform();//overloaded contextClick()
		//act.doubleClick(menu).perform();// overloaded doubleClick()
		//send the key 'w'
		//act.sendKeys("W").perform();
		//Perform keyboard actions like arrow keys, enter keys etc		
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		//Building a composite action
		//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
		//	sendKeys(Keys.ENTER).perform();		
	}	
}
