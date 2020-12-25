package com.actiTime.Generics;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoconfig {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		AutoLib at = new AutoLib();
		driver=at.getdriver(Browser);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(url);	
	}
}
