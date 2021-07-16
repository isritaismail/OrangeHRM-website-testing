package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class admin_job_paygrade_object_locator {
	// class variable
	 private static WebElement locator=null;
	 
/*     // Add info
	 // add_button
	 public static WebElement addbutton(WebDriver driver){
	 locator=driver.findElement(By.id("btnAdd"));
		return locator;
	}
	 //grade name
	 public static WebElement gradename(WebDriver driver){
		 locator=driver.findElement(By.id("payGrade_name"));
			return locator;
		}
	 //save button
	 public static WebElement savebutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnSave"));
			return locator;
		}
	 //add currency button
	 public static WebElement addcurrency(WebDriver driver){
		 locator=driver.findElement(By.id("btnAddCurrency"));
			return locator;
		}
	 //currency
	 public static WebElement currency(WebDriver driver){
		 locator=driver.findElement(By.id("payGradeCurrency_currencyName"));
			return locator;
		}
	 //mini_salary
	 public static WebElement min_salary(WebDriver driver){
		 locator=driver.findElement(By.id("payGradeCurrency_minSalary"));
			return locator;
		}
	 //max_salary
	 public static WebElement max_salary(WebDriver driver){
		 locator=driver.findElement(By.id("payGradeCurrency_maxSalary"));
			return locator;
		}
	 //save button
	 public static WebElement savecurrencybutton(WebDriver driver){
		 locator=driver.findElement(By.id("btnSaveCurrency"));
			return locator;
		}
	 //cancel button
	 public static WebElement cancelbutton(WebDriver driver){
		 locator=driver.findElement(By.id("cancelButton"));
			return locator;
	 }
	*/
	 //delete info
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
		/* //ok button
		 public static WebElement okbutton(WebDriver driver) {
		      	locator=driver.findElement(By.id("dialogDeleteBtn"));
		      	 return locator;
           }*/
		//cancel button
		   public static WebElement cancelbutton(WebDriver driver) {
		      	locator=driver.findElement(By.xpath("//body[@class='modal-open']/div[@id='wrapper']/div[@id='content']/div[@id='deleteConfModal']/div[@class='modal-footer']/input[2]"));
		      	 return locator;
				}
}




