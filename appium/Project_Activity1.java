package project;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.AfterClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Project_Activity1 {
    
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel4");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.google.android.apps.tasks");
        desiredCapabilities.setCapability("appActivity", ".ui.TaskListsActivity");
        desiredCapabilities.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, desiredCapabilities);
        wait = new WebDriverWait(driver , 20);
    }
	
  @Test
  public void createTask() {
	  
	  //Add first task
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));//wait for app to load
	  driver.findElementById("tasks_fab").click();//Find add task button
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));//wait for task input
	  driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");//Add first task
	  driver.findElementById("add_task_done").click();//Save the task
	  
	  //Add second task
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
	  driver.findElementById("tasks_fab").click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
	  driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
	  driver.findElementById("add_task_done").click();
	  
	  //Add third task
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
	  driver.findElementById("tasks_fab").click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
	  driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
	  driver.findElementById("add_task_done").click();  
	  
	  //Assertions
	  wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
	  List<MobileElement> tasksAdded = driver.findElementsById("task_name");
	  assertEquals(tasksAdded.size(), 3);
	  assertEquals(tasksAdded.get(2).getText(),"Complete Activity with Google Tasks" );
	  
 }

@AfterClass
  public void tearDown() {
      driver.quit();
  }
	
}

