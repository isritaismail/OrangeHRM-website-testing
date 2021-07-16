package frameworkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pim_emplist_object_loctor {
	private static WebElement locator=null;
	
	//employeename
    public static WebElement emp_name(WebDriver driver){
  	  locator= driver.findElement(By.id("empsearch_employee_name_empName"));
  	  return locator;
    }
    //emp_id
    public static WebElement emp_id(WebDriver driver){
    	  locator= driver.findElement(By.id("empsearch_id"));
    	  return locator;
      }
    //emp_status
    public static Select emp_status(WebDriver driver){
    	 Select dropdownbox= new Select(driver.findElement(By.id("empsearch_employee_status")));
		  return dropdownbox;
    }
    //include
    public static Select include(WebDriver driver){
    	 Select dropdownbox= new Select(driver.findElement(By.id("empsearch_termination")));
		  return dropdownbox;
    }
    //supervisor_name
    public static WebElement supervisor_name(WebDriver driver){
  	  locator= driver.findElement(By.id("empsearch_supervisor_name"));
  	  return locator;
    }
    //job title
    public static Select jobtitle(WebDriver driver){
    	Select dropdownbox= new Select(driver.findElement(By.id("empsearch_job_title")));
		  return dropdownbox;
      }
    //subunit
    public static Select subunit(WebDriver driver){
    	Select dropdownbox= new Select(driver.findElement(By.id("empsearch_sub_unit")));
		  return dropdownbox;
      }
    //searchbutton
    public static  WebElement searchbutton(WebDriver driver){
    	locator= driver.findElement(By.id("searchBtn"));
  	  return locator;
      }
    //resetbutton
  /*  public static WebElement resetbutton(WebDriver driver){
    	locator= driver.findElement(By.id("resetBtn"));
  	  return locator;
      }*/
}
