package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselabrary.BaseLibrary;
import page.LoginPage;

public class LoginTest extends BaseLibrary {
	
	@BeforeTest
	public void lunchUrl() 
	   {
		lunchUrl();
		}
		
	@Test
	public void clickonclose() {
		LoginPage ob= new LoginPage();
		ob.clickonclose();
		
	}
}
