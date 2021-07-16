package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.admin_job_paygrade_object_locator;
public class admin_job_paygrade_test_TestNG {
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
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewPayGrades");
			/*//add info
			admin_job_paygrade_object_locator.addbutton(driver).click();
			admin_job_paygrade_object_locator.gradename(driver).sendKeys("Grade 6");;
			admin_job_paygrade_object_locator.savebutton(driver).click();
			admin_job_paygrade_object_locator.addcurrency(driver).click();
			admin_job_paygrade_object_locator.currency(driver).sendKeys("USD - United States Dollar");
			admin_job_paygrade_object_locator.min_salary(driver).sendKeys("20000");
			admin_job_paygrade_object_locator.max_salary(driver).sendKeys("30000");
			admin_job_paygrade_object_locator.savecurrencybutton(driver).click();
			admin_job_paygrade_object_locator.cancelbutton(driver).click();
			*/
			//Delete info
			admin_job_paygrade_object_locator.checkbox(driver).click();
			admin_job_paygrade_object_locator.deletebutton(driver).click();
		    //admin_job_paygrade_object_locator.okbutton(driver).click();
		    admin_job_paygrade_object_locator.cancelbutton(driver).click();
	}
         //Close
         @AfterTest
	     public void Teardown(){
	 //	driver.close();
		driver.quit();
	}
}