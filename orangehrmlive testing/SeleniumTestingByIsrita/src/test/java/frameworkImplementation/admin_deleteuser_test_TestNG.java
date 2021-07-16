package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.admin_deleteuser_object_locator;

public class admin_deleteuser_test_TestNG {
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
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	/*	// delete info
		 //checkbox
		 admin_deleteuser_object_locator.checkbox(driver).click();
		 //checkbox1
		 admin_deleteuser_object_locator.checkbox1(driver).click();
		 //delete button
		 admin_deleteuser_object_locator.deletebutton(driver).click();
		 //ok button
	     admin_deleteuser_object_locator.confirmation_require(driver).click();
	     //cancel button
		 admin_deleteuser_object_locator.cancelbutton(driver).click();
	*/
		 //edit info
		 admin_deleteuser_object_locator.nameclick(driver).click();
		 admin_deleteuser_object_locator.editbutton(driver).click();
		//user_role
		 admin_deleteuser_object_locator.user_role(driver).selectByValue("2");
	    //employee_name
		 admin_deleteuser_object_locator.employee_name(driver).sendKeys("Sania Shaheen");
		//username
		 admin_deleteuser_object_locator.username(driver).sendKeys("Richi.Shaheen");
		//status
		 admin_deleteuser_object_locator.status(driver).selectByIndex(1);
		 //checkbox3
		 admin_deleteuser_object_locator.checkbox3(driver).click();
		//password
		 admin_deleteuser_object_locator.password(driver).sendKeys("richi124");
		//confirm_pass
		 admin_deleteuser_object_locator.confirm_pass(driver).sendKeys("richi124");
		//save_ button
		 admin_deleteuser_object_locator.savebutton(driver).click();
		//cancel button
		// admin_deleteuser_object_locator.cancelbutton(driver).click();
	}
		//Close
		
		@AfterTest
		public void Teardown(){
		//	driver.close();
			driver.quit();
		}
}
