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

public class LMS_Activity8 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void contactUs() throws InterruptedException {
		
		WebElement contact = driver.findElement(By.linkText("Contact"));
		contact.click();
		String contactTitle= driver.getTitle();
		Assert.assertEquals(contactTitle, "Contact – Alchemy LMS");
		//passing full name
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Sukanya Mankala");
		
		//passing email
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("test@abc.com");
		
		//passing subject
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Links not working");
		
		//passing subject
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Some links in the page are not working. Getting page not found error");
				
		//clicking send message button
		driver.findElement(By.id("wpforms-submit-8")).click();
		Assert.assertTrue(driver.findElement(By.id("wpforms-confirmation-8"))!=null);
		
		String confirmationMsg = driver.findElement(By.id("wpforms-confirmation-8")).getText();
				
			System.out.println(confirmationMsg);
		
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
