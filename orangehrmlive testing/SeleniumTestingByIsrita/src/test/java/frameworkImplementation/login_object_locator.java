package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_object_locator {
      //class variable
	  private  static WebElement locator=null;
	  //Email
	 public static WebElement username(WebDriver driver){
		 locator=driver.findElement(By.id("txtUsername"));
		 return locator;
		 }
	 //Password
     public static WebElement Password(WebDriver driver){
		 locator=driver.findElement(By.id("txtPassword"));
		 return locator;
		 }
      //login button
     public static WebElement loginbutton(WebDriver driver){ 
	 locator=driver.findElement(By.id("btnLogin"));
	 return locator;
	 }
}
