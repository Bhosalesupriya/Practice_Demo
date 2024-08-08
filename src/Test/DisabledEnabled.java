package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisabledEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");    
	       // count how many  check box are present .. u need to identify any one attribute = value should common locator for check box 
	       // count number of check box 
	      System.out.println(driver.findElements(By.cssSelector("input[type= 'checkbox']")).size());         
	       driver.findElement(By.id("divpaxinfo")).click();
	       Thread.sleep(2000L);
	       
	       
	    // Instead of above line we can use assertion to validate the results 
	       Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));
	       
	       driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    
	       // checking Radio or button is enabled or disabled , it will displayed changing locator 
	        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	       
	       //  this below x path for 'round Trip' radio button, once it is selected than Return date calendar is active  
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		   // checking Radio or button is enabled or disabled , it will displayed changing locator 
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        
	    // this below Path is for enable/active return date calendar if is enabled than it will return True
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
           // why here below we write contains as 1 because  opacity: 1; in HTML page, if u add 0.5 than it will fail 
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        { 
        	System.out.println("it's Enabled");
        	  Assert.assertTrue(true);
        }
        
        // if part met condition than elase part will skip 
        else  
        {  
        	Assert.assertTrue(false);
        }
		
	}

}
