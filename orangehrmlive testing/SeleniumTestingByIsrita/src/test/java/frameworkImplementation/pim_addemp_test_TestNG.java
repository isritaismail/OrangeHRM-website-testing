package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.pim_addemp_object_locator;
public class pim_addemp_test_TestNG {
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
				//Add info
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
				pim_addemp_object_locator.firstname(driver).sendKeys("Robert");
				pim_addemp_object_locator.lastname(driver).sendKeys("Steven");
				pim_addemp_object_locator.photo(driver).sendKeys("C:\\Users\\isrit\\Desktop\\Automation testing\\image.jpg");
				pim_addemp_object_locator.logindetails(driver).click();
				pim_addemp_object_locator.username(driver).sendKeys("Robert");
				pim_addemp_object_locator.password(driver).sendKeys("Robert123");
				pim_addemp_object_locator.confirmpass(driver).sendKeys("Robert123");
				pim_addemp_object_locator.status(driver).selectByIndex(1);
				pim_addemp_object_locator.save(driver).click();
				
				//personal details
				pim_addemp_object_locator.editbutton(driver).click();
				pim_addemp_object_locator.licensenum(driver).sendKeys("012345678");
				pim_addemp_object_locator.gender(driver).click();
				pim_addemp_object_locator.maritalstatus(driver).selectByIndex(1);
				pim_addemp_object_locator.nationality(driver).selectByValue("27");
				pim_addemp_object_locator.savebutton(driver).click();
				
				//custom fields
				pim_addemp_object_locator.edit_button(driver).click();
				pim_addemp_object_locator.bloodtype(driver).selectByIndex(3);
				pim_addemp_object_locator.save_button(driver).click();
				

	 }
	   //Close
	 	@AfterTest
	 	public void Teardown(){
	 	//driver.close();
	 	driver.quit();
	 	}
}
