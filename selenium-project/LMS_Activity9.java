package projectLMS;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity9 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeC() {
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	@Test
	public void login() throws InterruptedException {
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
		
		Assert.assertTrue(driver.findElement(By.partialLinkText("Howdy, "))!=null);
		
	}
	
	@Test(dependsOnMethods="login")
	public void All_courses() throws InterruptedException {
		
		WebElement allCourses = driver.findElement(By.linkText("All Courses"));
		allCourses.click();
		List<WebElement> courses =driver.findElements(By.xpath("//div[contains(@class,'col-sm-8')]"));
		System.out.println("The no of course available in All course is "+ courses.size());
		
		//Selecting a course
		driver.findElement(By.xpath("//div[contains(@class,'col-sm-8')][2]//a[text()='See more...']")).click();
		
		System.out.println("Course choosen is...." +driver.getTitle());
		Thread.sleep(1000);
		
		//selecting a topic
		driver.findElement(By.xpath("//div[@class='ld-item-title' and contains(text(),'Deliverability Of Your Emails')]")).click();
		
		System.out.println("Topic currently reading is---"+driver.getTitle());
		Thread.sleep(1000);
		
		try {
			driver.findElement(By.xpath("//a[text()='Back to Course']/parent::div//input[@value='Mark Complete']")).submit();
			
		} catch(Exception e) {
			System.out.println("Mark as complete option not available");
		}
		
		
	}
	
  @AfterClass
  public void afterM() {
	  driver.close();
  }
}
