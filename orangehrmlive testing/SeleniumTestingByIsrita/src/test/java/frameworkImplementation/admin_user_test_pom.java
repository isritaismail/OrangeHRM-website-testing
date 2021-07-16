package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.admin_user_object_locator;

public class admin_user_test_pom {
         public static void main(String[] args) {
			
            WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			
			// loginpage_info
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			login_object_locator.username(driver).sendKeys("Admin");
			login_object_locator.Password(driver).sendKeys("admin123");
			login_object_locator.loginbutton(driver).click();
		  
			
			// Admin search& Reset
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
			//username
			admin_user_object_locator.username(driver).sendKeys("Jadine.Jackie");
			//user role
			admin_user_object_locator.userrole(driver).selectByIndex(2);
			//employee name
			admin_user_object_locator.Employeename(driver).sendKeys("Jadine Jackie");
			//status
			admin_user_object_locator.status(driver).selectByIndex(1);
		    // search button	
			//admin_user_object_locator.searchbutton(driver).click();
			//reset button
			admin_user_object_locator.resetbutton(driver).click();
		}
}
