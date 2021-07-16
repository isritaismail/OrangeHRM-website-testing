package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pim_addemp_object_locator {
	// Add info
	//class variable
	private static WebElement locator=null;
     //first name  
	public static WebElement firstname(WebDriver driver){
    	 locator=driver.findElement(By.id("firstName"));
    	   return locator;
       }
	//lastname
	public static WebElement lastname(WebDriver driver){
   	 locator=driver.findElement(By.id("lastName"));
   	   return locator;
      }
	//photo
	public static WebElement photo(WebDriver driver){
	   	 locator=driver.findElement(By.id("photofile"));
	   	   return locator;
	      }
	//logincheckbutton
	public static WebElement logindetails(WebDriver driver){
	   	 locator=driver.findElement(By.id("chkLogin"));
	   	   return locator;
	      }
	//username
	public static WebElement username(WebDriver driver){
	   	 locator=driver.findElement(By.id("user_name"));
	   	   return locator;
	      }
	//password
	public static WebElement password(WebDriver driver){
	   	 locator=driver.findElement(By.id("user_password"));
	   	   return locator;
	      }
	//confirmpass
	public static WebElement confirmpass(WebDriver driver){
	   	 locator=driver.findElement(By.id("re_password"));
	   	   return locator;
	      }
	//status
	public static Select status(WebDriver driver){
   	 Select dropdownbox= new Select(driver.findElement(By.id("status")));
		  return dropdownbox;
   }
	//savebutton
	public static WebElement save(WebDriver driver){
	   	 locator=driver.findElement(By.id("btnSave"));
	   	   return locator;
	      }
	// personal details
	//Editbutton
	public static WebElement editbutton(WebDriver driver){
	   	 locator=driver.findElement(By.id("btnSave"));
	   	   return locator;
	      }
	public static WebElement licensenum(WebDriver driver){
	   	 locator=driver.findElement(By.id("personal_txtLicenNo"));
	   	   return locator;
	      }
	      public static WebElement gender(WebDriver driver){
	 	   	 WebElement radiobox= driver.findElement(By.id("personal_optGender_1"));
	 			  return radiobox;
	 	   }
	public static Select maritalstatus(WebDriver driver){
	   	 Select dropdownbox= new Select(driver.findElement(By.id("personal_cmbMarital")));
			  return dropdownbox;
	   }
	public static Select nationality(WebDriver driver){
	   	 Select dropdownbox= new Select(driver.findElement(By.id("personal_cmbNation")));
			  return dropdownbox;
	   }
	public static WebElement savebutton(WebDriver driver){
	   	 locator=driver.findElement(By.id("btnSave"));
	   	   return locator;
	      }
	//custom fields
	public static WebElement edit_button(WebDriver driver){
	   	 locator=driver.findElement(By.id("btnEditCustom"));
	   	   return locator;
	      }
	public static Select bloodtype(WebDriver driver){
	   	 Select dropdownbox= new Select(driver.findElement(By.xpath("//form[@id='frmEmpCustomFields']//ol//li//select[@class='editable']")));
			  return dropdownbox;
	   }
	public static WebElement save_button(WebDriver driver){
	   	 locator=driver.findElement(By.id("btnEditCustom"));
	   	   return locator;
	      }
	
	
}	

