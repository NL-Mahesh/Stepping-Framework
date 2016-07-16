package webdriverconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeKeyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue="
				+ "https://mail.google.com/mail/#identifier");		
		WebElement usn=driver.findElement(By.id("Email"));
		usn.sendKeys("netekeremahe");	
		WebElement ent=driver.findElement(By.cssSelector("input[id='next']"));	
		Actions act=new Actions(driver);
		act.sendKeys(ent, Keys.ENTER).perform();
		driver.findElement(By.id("Passwd")).sendKeys("hi");
		Thread.sleep(2000);	*/
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue="
				+ "https%3A%2F%2Fmail.google.com%2Fmail%2F");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		Actions act=new Actions(driver);
		driver.findElement(By.id("FirstName")).sendKeys("N","a","m","e");
		Thread.sleep(2000);
		//Composite actions in webdriver directly
		driver.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL,"v");	
		act.sendKeys(driver.findElement(By.id("LastName")), Keys.CONTROL,"v").perform();
	}

}
