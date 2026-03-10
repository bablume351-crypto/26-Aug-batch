package com.automation.SeleniumMaven;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TestAutomation {

	public static void main(String[] args)throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a/div/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"slot-list-container\"]/div/div[3]/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/a/div/picture/img")).click();
	driver.findElement(By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/a/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();
    driver.findElement(By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[13]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div")).click();
	}

    }
    
	
	

	
	


