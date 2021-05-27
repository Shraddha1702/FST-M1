package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void fnsetUp() {
		//Initialize the firefox driver
		driver = new FirefoxDriver();
		//Navigate to the respective url
		driver.get("https://www.training-support.net");
		
	}
	
	@Test
	public void fnActivity1() {
		//Get the title of the page
		String title = driver.getTitle();
//		System.out.println("Current URL is: "+driver.getCurrentUrl());
//		System.out.println("Page source: "+driver.getPageSource());
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getClass());
//		System.out.println(driver.manage().getCookieNamed(title));
		System.out.println("Page title is: "+title);
		
		//Find the click link on the page and click it
        driver.findElement(By.id("about-link")).click();
                    
        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
		
	}
	@AfterMethod
	public void fntearDown() {
		driver.close();
	}

}
