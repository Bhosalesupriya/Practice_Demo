package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.lang.Thread;
import java.time.Duration;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		// WebDriver driver = new ChromeDriver();
		 
		 System.setProperty("WebDriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.33.0-win64");
	
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	       String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      //driver.manage().window().maximize();
	       //Implicit wait 2 seconds time out
	       
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	      driver.findElement(By.name("inputPassword")).sendKeys(password);
	      driver.findElement(By.className("signInBtn")).click();
	      //Thread.sleep(2000);
	      Thread.sleep(1000);
	      // using Tag name which is unique in whole page
	   System.out.println(driver.findElement(By.tagName("p")).getText());
	   // assertion to compare actual and expected text 
	   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	      // to compare the text using parent to child css path 
	   System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
	   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahul,");
	   driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	}
      public static String getpassword(WebDriver driver) throws InterruptedException {
    	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	  driver.findElement(By.linkText("Forgot your password?")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	      String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
	      //Please use temporary password 'rahulshettyacademy' to Login.
	      // 0th index--  Please use temporary password 
	      // 1st index-- rahulshettyacademy' to Login.
	      
	      String [] passwordArray = passwordtext.split("'");
	      
	      //0th index -- rahulshettyacademy
	      //1st index-- ' to Login.
	      
	     // String[] passwordArray2 = passwordArray[1].split("'");
	       //passwordArray2[0];
	      
	      String password = passwordArray[1].split("'")[0];
	      return password;
	      
	      
      }
}
