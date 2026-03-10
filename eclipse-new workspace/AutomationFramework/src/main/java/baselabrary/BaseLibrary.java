package baselabrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseLibrary {
	public static  WebDriver driver= null;
	public void lunchUrl() {
		String path="C:\\Users\\User\\eclipse-new workspace\\AutomationFramework\\WebDriver\\chromedriver.exe";
		System.setProperty("WebDriver.Chrome.driver", path);
		 driver=new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
	
	}

}
