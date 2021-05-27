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

public class LMS_Activity2 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void header_Validation() {
		WebElement heading = driver.findElement(By.xpath("//h1"));
		Assert.assertEquals(heading.getText(), "Learn from Industry Experts","Heading not matching");
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
