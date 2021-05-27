package projectLMS;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity4 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void header3_2_Validation() {
		//WebElement heading = driver.findElement(By.xpath("//h3[@class='entry-title' and text()='Email Marketing Strategies']"));
		
		WebElement heading = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));
		Assert.assertEquals(heading.getText(), "Email Marketing Strategies","Heading3_2 not matching");
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
