package com.actiTime.TestScripts;

import org.testng.annotations.Test;

import com.actiTime.Generics.BaseTest;
import com.actiTime.pages.LoginPage;

public class LoginTet extends BaseTest {
	
	@Test
	public void login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.usernamebtn(un);
		lp.pwdbtn(pwd);
		lp.loginbtn();
		
		
	}
	

}
