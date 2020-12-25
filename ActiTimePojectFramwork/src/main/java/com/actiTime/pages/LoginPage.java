package com.actiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username") private WebElement unTb;
	@FindBy(name="pwd") private WebElement pwdbt;
	@FindBy(id="loginButton") private WebElement login;
	
	
	public void usernamebtn(String un) {
		unTb.sendKeys(un);
	}
	
	public void pwdbtn(String pwd) {
		pwdbt.sendKeys(pwd);
	}
	
	public void loginbtn() {
		login.click();
		
	}
}
