package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class admin_job_object_locator {
	// class variable
	 private static WebElement locator=null;
	 
/*	// Add info
	 // add_button
	 public static WebElement addbutton(WebDriver driver){
	 locator=driver.findElement(By.id("btnAdd"));
		return locator;
	}
	//job_title
	 public static WebElement job_title(WebDriver driver){
		 locator=driver.findElement(By.id("jobTitle_jobTitle"));
			return locator;
		}
	 //job_description
	 public static WebElement job_description(WebDriver driver){
		 locator=driver.findElement(By.id("jobTitle_jobDescription"));
			return locator;
		}
	 //job_specification
	 public static WebElement job_specification(WebDriver driver){
		 locator=driver.findElement(By.id("jobTitle_jobSpec"));
			return locator;
		}
	 //note
	 public static WebElement note(WebDriver driver){
		 locator=driver.findElement(By.id("jobTitle_note"));
			return locator;
		}
	 //save_button
	 public static WebElement savebutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnSave"));
			return locator;
		}
	 //cancel_button
	 public static WebElement cancelbutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnCancel"));
			return locator;
		}*/
	 
/*	 //Edit info
	 public static WebElement nameclick(WebDriver driver){
		 locator=driver.findElement(By.linkText("Database Administrator"));
			return locator;
	 }
	// edit_button
			 public static WebElement editbutton(WebDriver driver){
			 locator=driver.findElement(By.id("btnSave"));
				return locator;
		}
		
		//job_title
	 public static WebElement job_title(WebDriver driver){
		 locator=driver.findElement(By.name("jobTitle[jobTitle]"));
			return locator;
		}
	 //job_description
	 public static WebElement job_description(WebDriver driver){
		 locator=driver.findElement(By.id("jobTitle_jobDescription"));
			return locator;
		}
	 //save_button
	 public static WebElement savebutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnSave"));
			return locator;
		}
	 //cancel_button
	  public static WebElement cancelbutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnCancel"));
			return locator;
		}
		*/
	//Delete info
	 //checkbox
	 public static WebElement checkbox(WebDriver driver) {
      	locator=driver.findElement(By.id("ohrmList_chkSelectRecord_5"));
      	 return locator;
		}
	 //deletebutton
	 public static WebElement deletebutton(WebDriver driver) {
	      	locator=driver.findElement(By.id("btnDelete"));
	      	 return locator;
			}
	 //ok button
	/* public static WebElement okbutton(WebDriver driver) {
	      	locator=driver.findElement(By.id("dialogDeleteBtn"));
	      	 return locator;
			}*/
	 //cancel button
	   public static WebElement cancelbutton(WebDriver driver) {
	      	locator=driver.findElement(By.xpath("//body[@class='modal-open']/div[@id='wrapper']/div[@id='content']/div[@id='deleteConfModal']/div[@class='modal-footer']/input[2]"));
	      	 return locator;
			}
}
