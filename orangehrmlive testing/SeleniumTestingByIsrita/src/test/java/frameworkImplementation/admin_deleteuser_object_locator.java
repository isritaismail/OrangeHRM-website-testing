package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class admin_deleteuser_object_locator {
	     private  static WebElement locator=null;
        
   /* // checkbox 
         public static WebElement checkbox(WebDriver driver) {
         	locator=driver.findElement(By.id("ohrmList_chkSelectRecord_26"));
         	 return locator;
 		}
         
	     //checkbox1
	     public static WebElement checkbox1(WebDriver driver) {
	       locator=driver.findElement(By.id("ohrmList_chkSelectRecord_20"));
	         	 return locator;
	 		}
         // delete button
          public static WebElement deletebutton (WebDriver driver) {
         	locator=driver.findElement(By.id("btnDelete"));
         	 return locator;
 		}
         // ok button
         public static WebElement confirmation_require (WebDriver driver) {
          	locator=driver.findElement(By.id("dialogDeleteBtn"));
          	 return locator;
  		}
         // cancel button
         public static WebElement cancelbutton(WebDriver driver) {
        locator=driver.findElement(By.xpath("//body[@class='modal-open']/div[@id='wrapper']/div[@id='content']/div[@id='deleteConfModal']/div[@class='modal-footer']/input[2]"));
           	 return locator;
   		}*/
      
      // Edit info
         
         public static WebElement nameclick(WebDriver driver) {
          	locator=driver.findElement(By.linkText("Sania.Shaheen"));
          	 return locator;
         }
         public static WebElement editbutton(WebDriver driver) {
           	locator=driver.findElement(By.id("btnSave"));
           	 return locator;
          }
         // user_role
   	  public static Select user_role(WebDriver driver){
   			 Select dropdownbox= new Select(driver.findElement(By.id("systemUser_userType")));
   			  return dropdownbox;
   	  }
   	  // employee_name
   	  public static WebElement employee_name(WebDriver driver){
   	      locator= driver.findElement(By.id("systemUser_employeeName_empName"));
   	       return locator;	  
   	      }
   	  //username
   	  public static WebElement username(WebDriver driver){
   	      locator= driver.findElement(By.name("systemUser[userName]"));
   	       return locator;	  
   	      }
   	  //status
   	  public static Select status(WebDriver driver){
   			 Select dropdownbox= new Select(driver.findElement(By.id("systemUser_status")));
   			  return dropdownbox;
   	  }
   	  
   	   public static WebElement checkbox3(WebDriver driver) {
     	locator=driver.findElement(By.id("systemUser_chkChangePassword"));
     	 return locator;
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
   	 /* public static WebElement cancelbutton(WebDriver driver){
   	      locator= driver.findElement(By.id("btnCancel"));
   	       return locator;	  
   	      }*/
         
         
}
