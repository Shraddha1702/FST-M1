package projectLMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void title_Validation() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application","Title not matching");
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
