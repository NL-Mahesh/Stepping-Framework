package webdriverconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PerformingAction 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		System.out.println("Application Openend");
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys("user");
		driver.findElement(By.name("pwd")).sendKeys("user");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		//driver.findElement(By.cssSelector("a[class='initial']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

}
