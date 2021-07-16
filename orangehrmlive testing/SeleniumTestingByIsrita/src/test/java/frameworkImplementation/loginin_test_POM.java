package frameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import frameworkImplementation.login_object_locator;

public class loginin_test_POM {
      
	public static void main(String[] args) {
	  // setup
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
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
}

