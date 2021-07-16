package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
       public static void main(String[] args) throws InterruptedException {
		
    	   
    	   WebDriverManager.firefoxdriver().setup();
    	   WebDriver driver= new FirefoxDriver();
    	   driver.get("https://opensource-demo.orangehrmlive.com/");
   	     
    // windows maximize
    	   
    	   driver.manage().window().maximize();
    	   Thread.sleep(1000);
   //login
    	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   	      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
   
   // login button
          driver.findElement(By.id("btnLogin")).click();
    	//  Thread.sleep(2000);
   
   // forget password
    //	   driver.findElement(By.linkText("Forgot your password?")).click();
    	   
   // next url
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers/");
    	   
  
	}
}
