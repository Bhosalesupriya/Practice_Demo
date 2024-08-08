package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       //driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	      // System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	       
	       //driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	       //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	       
	       // count how many  check box are present .. u need to identify any one attribute = value should common locator for check box 
	       // count number of check box 
	      System.out.println(driver.findElements(By.cssSelector("input[type= 'checkbox']")).size());         
	       driver.findElement(By.id("divpaxinfo")).click();
	       Thread.sleep(2000L);
	       
	       
	    // Instead of above line we can use assertion to validate the results 
	       Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));
	       
	       driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	       
	       // count how many  check box are present .. u need to identify any one attribute = value should common locator for check box 
	       // count number of check box 
	      System.out.println(driver.findElements(By.cssSelector("input[type= 'checkbox']")).size());         
	      driver.findElement(By.id("divpaxinfo")).click();
	      Thread.sleep(2000);
	      
         
}
    }
