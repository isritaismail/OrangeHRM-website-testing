package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class admin_user_object_locator{
	// class variable
	   private static WebElement locator=null;
	   WebElement dropdownbox=null;
    //search username
	public static WebElement username(WebDriver driver){
	    locator=driver.findElement(By.id("searchSystemUser_userName"));
		return locator;
	}
	// user role
     public static Select userrole(WebDriver driver){
     Select dropdownbox= new Select(driver.findElement(By.id("searchSystemUser_userType")));
	  return dropdownbox;	
	}
    // search employee name
	public static WebElement Employeename(WebDriver driver){
	    locator=driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		return locator;
	}
	// status
	  public static Select status(WebDriver driver){
	 Select dropdownbox= new Select(driver.findElement(By.id("searchSystemUser_status")));
	  return dropdownbox;	
	}
	// search button
//	public static WebElement searchbutton(WebDriver driver){
//	    locator=driver.findElement(By.id("searchBtn"));
//		return locator;
//     }
	// reset button
	public static WebElement resetbutton(WebDriver driver){
	    locator=driver.findElement(By.id("resetBtn"));
		return locator;
	}
	
	}
