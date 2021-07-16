package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class admin_adduser_object_locator {
	  // create class variable
	  private static  WebElement locator=null;
      // add button
	  public static WebElement addbutton(WebDriver driver){
      locator= driver.findElement(By.id("btnAdd"));
       return locator;	  
      }
	  // user_role
	  public static Select user_role(WebDriver driver){
			 Select dropdownbox= new Select(driver.findElement(By.id("systemUser_userType")));
			  return dropdownbox;
	  }
	  // employee_name
	  public static WebElement employee_name(WebDriver driver){
	      locator= driver.findElement(By.id("systemUser_userType"));
	       return locator;	  
	      }
	  //username
	  public static WebElement username(WebDriver driver){
	      locator= driver.findElement(By.id("systemUser_userName"));
	       return locator;	  
	      }
	  //status
	  public static Select status(WebDriver driver){
			 Select dropdownbox= new Select(driver.findElement(By.id("systemUser_status")));
			  return dropdownbox;
	  }
	  //password
	  public static WebElement password(WebDriver driver){
	      locator= driver.findElement(By.id("systemUser_password"));
	       return locator;	  
	      }
	  //confirm_pass
	  public static WebElement confirm_pass(WebDriver driver){
	      locator= driver.findElement(By.id("systemUser_confirmPassword"));
	       return locator;	  
	      }
	  // save button
	  public static WebElement savebutton(WebDriver driver){
	      locator= driver.findElement(By.id("btnSave"));
	       return locator;	  
	      }
	  // cancel_button
	  public static WebElement cancelbutton(WebDriver driver){
	      locator= driver.findElement(By.id("btnCancel"));
	       return locator;	  
	      }
  }

