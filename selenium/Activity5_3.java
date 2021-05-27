package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println("The page title is: "+title);
		
		WebElement txtbox = driver.findElement(By.id("dynamicText"));
		boolean txtBoxStat = txtbox.isEnabled();
		
		if(txtBoxStat == true) {
			WebElement enableTxtbox = driver.findElement(By.id("toggleInput"));
			enableTxtbox.click();
		}else {
			System.out.println("The element is not enabled");
		}
		
		WebElement txtBoxAft = driver.findElement(By.id("dynamicText"));
		boolean aftResult = txtBoxAft.isEnabled();
		
		if(aftResult == true) {
			txtBoxAft.sendKeys("Enabled");
			System.out.println(driver.findElement(By.id("dynamicText")).getText());
		}else {
			System.out.println("There is something problem with the input field");
		}
		
		driver.close();
		
	}
}
