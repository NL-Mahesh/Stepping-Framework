package com.application.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Configuration;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	String url="http://demo.actitime.com//login.do";	
	@Parameters({ "browser" })
	@BeforeClass	
	public void launchApplication(String browser){
		
		if(browser.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", 
					"src/test/resources/browserdirvers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", 
					"src/test/resources/browserdirvers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}

}
