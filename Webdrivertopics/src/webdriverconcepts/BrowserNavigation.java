package webdriverconcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserNavigation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		//driver.get("http://www.seleniumhq.org/download/");
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Navigation n=driver.navigate();
		//Alternate to driver.get()
		//n.to("http://www.seleniumhq.org/download/");
		driver.navigate().to("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);
		n.forward();
		Thread.sleep(2000);
		n.refresh();
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
	}
}
