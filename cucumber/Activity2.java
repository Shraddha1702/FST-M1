package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void User_is_on_Login_page() throws Throwable{
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@When("^User enters username and password$")
	public void User_enters_username_and_password() throws Throwable{
		//Enter username
        driver.findElement(By.id("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.id("password")).sendKeys("password");
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("^Read the page title and confirmation message$")
	public void Read_the_page_title_and_confirmation_message() throws Throwable{
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
		
		String pageTitle = driver.getTitle();
		String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
		
		System.out.println("The page title is:"+pageTitle);
		
		System.out.println("Confirmation message:"+confirmMessage);
		
		assertEquals(pageTitle, "Login Form");
		
		assertEquals(confirmMessage, "Welcome Back, admin");
	}
	
	@And("^Close the Browser$")
	public void Close_the_Browser() throws Throwable{
		driver.close();
	}
	

}
