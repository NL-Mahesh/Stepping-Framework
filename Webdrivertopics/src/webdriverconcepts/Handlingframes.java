package webdriverconcepts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Handlingframes 
{	@Test
	public void testHandlingFrames()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[class='signin']")).click();
		//Using int argument-zero based index of frame in the page.
		//First frame is index zero
		//driver.switchTo().frame(0);
		//using string argument -id/name property value of the frame
		//driver.switchTo().frame("zohoiam");
		//Using Webelement argument _Identify the frame
		WebElement ifr=driver.findElement(By.xpath("//iframe[contains(@src,'accounts')]"));
		driver.switchTo().frame(ifr);
		//perform action on element inside frame
		driver.findElement(By.id("lid")).sendKeys("email@email.com");
		//switch out of frame
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}	
}
