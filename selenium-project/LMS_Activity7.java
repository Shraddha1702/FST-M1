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

public class LMS_Activity7 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void All_courses() throws InterruptedException {
		
		WebElement allCourses = driver.findElement(By.linkText("All Courses"));
		allCourses.click();
		List<WebElement> courses =driver.findElements(By.xpath("//div[contains(@class,'col-sm-8')]"));
		System.out.println("The no of course available in All course is "+ courses.size());
		
	}
	
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
