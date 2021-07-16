package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.admin_adduser_object_locator;
public class admin_adduser_test_pom {
         public static void main(String[] args) {
        	    WebDriverManager.firefoxdriver().setup();
    			WebDriver driver=new FirefoxDriver();
    			
    			// loginpage_info
    			driver.get("https://opensource-demo.orangehrmlive.com/");
    			driver.manage().window().maximize();
    			login_object_locator.username(driver).sendKeys("Admin");
    			login_object_locator.Password(driver).sendKeys("admin123");
    			login_object_locator.loginbutton(driver).click();
    		  
    		// add user
    			//url
    		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    			//click on add button
    		    admin_adduser_object_locator.addbutton(driver).click();
    			//user_role
    		    admin_adduser_object_locator.user_role(driver).selectByValue("2");
    		    //employee_name
    			admin_adduser_object_locator.employee_name(driver).sendKeys("Richi Haq");
    			//username
    			admin_adduser_object_locator.username(driver).sendKeys("Richi");
    			//status
    			admin_adduser_object_locator.status(driver).selectByIndex(1);
    			//password
    			admin_adduser_object_locator.password(driver).sendKeys("richi124");
    			//confirm_pass
    			admin_adduser_object_locator.confirm_pass(driver).sendKeys("richi124");
    			//save_ button
    			admin_adduser_object_locator.savebutton(driver).click();
    			//cancel button
    			admin_adduser_object_locator.cancelbutton(driver).click();
		}
}
