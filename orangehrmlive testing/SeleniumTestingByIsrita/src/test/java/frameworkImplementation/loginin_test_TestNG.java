package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.login_object_locator;

public class loginin_test_TestNG {
     // class variable
	  private static WebDriver driver=null;
	//before test   
	   @BeforeTest
	   public void SetupTest(){
	   WebDriverManager.firefoxdriver().setup();
	     driver=new FirefoxDriver();     
		}
	// test
	   @Test
	  public void Test(){
	 // url & maximize
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	//Email	
		login_object_locator.username(driver).sendKeys("Admin");
	//Password
		login_object_locator.Password(driver).sendKeys("admin123");
	//login button
		login_object_locator.loginbutton(driver).click();
	  
	}
	//Close
		@AfterTest
		public void Teardown(){
		//	driver.close();
			driver.quit();
		}
}

