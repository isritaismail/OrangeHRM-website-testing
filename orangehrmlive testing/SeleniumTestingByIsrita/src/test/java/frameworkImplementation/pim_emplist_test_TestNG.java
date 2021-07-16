package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.pim_emplist_object_loctor;
public class pim_emplist_test_TestNG {
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
				// loginpage_info
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				login_object_locator.username(driver).sendKeys("Admin");
				login_object_locator.Password(driver).sendKeys("admin123");
				login_object_locator.loginbutton(driver).click();
				
				//url
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");
				//Search info
				pim_emplist_object_loctor.emp_name(driver).sendKeys("Cecil Bonaparte");
				pim_emplist_object_loctor.emp_id(driver).sendKeys("0204");
				pim_emplist_object_loctor.emp_status(driver).selectByIndex(3);
				pim_emplist_object_loctor.include(driver).selectByIndex(0);
				pim_emplist_object_loctor.supervisor_name(driver).sendKeys("Fiona Grace");
				pim_emplist_object_loctor.jobtitle(driver).selectByValue("7");
				pim_emplist_object_loctor.subunit(driver).selectByIndex(3);
				pim_emplist_object_loctor.searchbutton(driver).click();
				
	 }			
	//Close
		@AfterTest
		public void Teardown(){
		//driver.close();
		driver.quit();
		}
}
