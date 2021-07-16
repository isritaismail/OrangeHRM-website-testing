package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.admin_job_object_locator;

public class admin_job_test_pom {
	public static void main(String[] args) {
		  WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			
			// loginpage_info
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			login_object_locator.username(driver).sendKeys("Admin");
			login_object_locator.Password(driver).sendKeys("admin123");
			login_object_locator.loginbutton(driver).click();
		  
			
			//url
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList");
		/*   //Add info
			admin_job_object_locator.addbutton(driver).click();
			admin_job_object_locator.job_title(driver).sendKeys("Computer Programmer");
			admin_job_object_locator.job_description(driver).sendKeys("Here at XYZ Inc., we are the leading company in our industry in the Capital City area. We're pleased to have a 3.8 Glassdoor rating from our employees. We are hiring an experienced Computer Programmer to help us keep growing. If you're dedicated and ambitious, XYZ Inc. is an excellent place to grow your career. Don't hesitate to apply.");
			admin_job_object_locator.job_specification(driver).sendKeys("C:\\Users\\isrit\\Desktop\\Automation testing\\job.txt");
			admin_job_object_locator.note(driver).sendKeys("Candidates should be experienced.");
			admin_job_object_locator.savebutton(driver).click();
			admin_job_object_locator.cancelbutton(driver).click();
*/			
		/*	//Edit info
			admin_job_object_locator.nameclick(driver).click();
			admin_job_object_locator.editbutton(driver).click();
			admin_job_object_locator.job_title(driver).getCssValue("Database Administrator");
			admin_job_object_locator.job_description(driver).sendKeys("Good organizational skills");
			admin_job_object_locator.savebutton(driver).click();
			*/
			// Delete info
			
			admin_job_object_locator.checkbox(driver).click();
			admin_job_object_locator.deletebutton(driver).click();
			//admin_job_object_locator.okbutton(driver).click();
			admin_job_object_locator.cancelbutton(driver).click();
	}

}

