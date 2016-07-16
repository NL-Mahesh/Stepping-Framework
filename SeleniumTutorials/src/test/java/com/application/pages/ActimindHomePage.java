package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.application.libraries.GenericLibrary;

public class ActimindHomePage {
	WebDriver driver;
	public ActimindHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Basic Facts")
	private WebElement basicFactsLink;
	
	public void verifyUrl(){
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.actitime.com/";
		Assert.assertEquals(actualUrl, expectedUrl);		
	}
	public void navigateToLoginPage(String title){
		GenericLibrary.closeBrowser(driver);
		GenericLibrary.switchToWIndow(driver, title);
	}
}
