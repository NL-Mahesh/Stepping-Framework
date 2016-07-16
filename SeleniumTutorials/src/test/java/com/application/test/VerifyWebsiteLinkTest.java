package com.application.test;

import org.testng.annotations.Test;

import com.application.pages.ActimindHomePage;
import com.application.pages.LoginPage;

public class VerifyWebsiteLinkTest extends BaseClass{
	@Test
	public void testVerifyWebsiteLink(){
		LoginPage lp = new LoginPage(driver);
		lp.navigateToWebsite();
		ActimindHomePage ahp = new ActimindHomePage(driver);
		ahp.verifyUrl();
		ahp.navigateToLoginPage("actiTIME - Login");
		lp.login("admin","manager");
	}
}
