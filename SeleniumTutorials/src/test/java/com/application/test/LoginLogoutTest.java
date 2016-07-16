package com.application.test;

import org.testng.annotations.Test;

import com.application.pages.EnterTimeTrackPage;
import com.application.pages.LoginPage;

public class LoginLogoutTest extends BaseClass {
	
	@Test
	public void testLoginLogout(){
		LoginPage lp=new LoginPage(driver);
		lp.login("admin", "manager");
		
		EnterTimeTrackPage ettp= new EnterTimeTrackPage(driver);
		ettp.logout();
	}

}
