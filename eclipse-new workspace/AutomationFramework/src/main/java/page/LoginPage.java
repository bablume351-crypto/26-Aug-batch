package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselabrary.BaseLibrary;

public class LoginPage {
	

	@FindBy(xpath ="//button[text()='×']")
	private WebElement close;
	
	public void clickonclose() {
		close.click();
		 
	}

		
	}


