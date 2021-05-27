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

public class LMS_Activity5 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void myAccount_title_Val() {
		
		WebElement myAccount = driver.findElement(By.linkText("My Account"));
		myAccount.click();
		String myAccount_title= driver.getTitle();
		Assert.assertEquals(myAccount_title, "My Account – Alchemy LMS","MyAccount title not matching");
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
