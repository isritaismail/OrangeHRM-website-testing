package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class admin_job_empstatus_object_locator {
	//class variable
	private static WebElement locator=null;
/*	//Add info
      public static WebElement addbutton(WebDriver driver){
	  locator= driver.findElement(By.id("btnAdd"));
	  return locator;
     }
      //employee status name
      public static WebElement empstatus_name(WebDriver driver){
    	  locator= driver.findElement(By.id("empStatus_name"));
    	  return locator;
      }
      //save button
      public static WebElement savebutton(WebDriver driver){
    	  locator= driver.findElement(By.id("btnSave"));
    	  return locator;
      }
      //cancel button
      public static WebElement cancelbutton(WebDriver driver){
    	  locator= driver.findElement(By.id("btnCancel"));
    	  return locator;
      }  */
      
      //Delete info
    //checkbox
 	 public static WebElement checkbox(WebDriver driver) {
       	locator=driver.findElement(By.id("ohrmList_chkSelectRecord_4"));
       	 return locator;
 		}
 	//deletebutton
 		 public static WebElement deletebutton(WebDriver driver) {
 		      	locator=driver.findElement(By.id("btnDelete"));
 		      	 return locator;
 				}
 		//ok button
 		 public static WebElement okbutton(WebDriver driver) {
 		      	locator=driver.findElement(By.id("dialogDeleteBtn"));
 		      	 return locator;
            }
 		/* //cancel button
 		   public static WebElement cancelbutton(WebDriver driver) {
 		      	locator=driver.findElement(By.xpath("//body[@class='modal-open']/div[@id='wrapper']/div[@id='content']/div[@id='deleteConfModal']/div[@class='modal-footer']/input[2]"));
 		      	 return locator;
 				}*/
 }

