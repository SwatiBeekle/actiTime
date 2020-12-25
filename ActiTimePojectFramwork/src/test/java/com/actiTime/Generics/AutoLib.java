package com.actiTime.Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoLib implements IAutoconfig {
	
	public WebDriver driver;
	public WebDriver getdriver(String browsertype) {
		System.out.println("=====browser is getting ready=====");
		if(browsertype.equalsIgnoreCase("firefox")) {
			System.setProperty(gecko_key_, gecko_value);
			driver= new FirefoxDriver();
		}else if(browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_key_, chrome_value);
			driver=new ChromeDriver();	
		}else {
			System.out.println("default browser");
		}
		return driver;
	}

}
