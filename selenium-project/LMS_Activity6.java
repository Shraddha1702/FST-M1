package projectLMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity6 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void myAccount_login() throws InterruptedException {
		
		WebElement myAccount = driver.findElement(By.linkText("My Account"));
		myAccount.click();
		WebElement login =driver.findElement(By.xpath("//a[contains(@class,'ld-button')]"));
		login.click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		String myAccount_title= driver.getTitle();
		
		Assert.assertEquals(myAccount_title, "My Account – Alchemy LMS");
		//Assert.assertTrue(driver.findElement(By.linkText("Howdy, "))!=null);
		Assert.assertTrue(driver.findElement(By.partialLinkText("Howdy, "))!=null);
		System.out.println("validations complete");
		
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
