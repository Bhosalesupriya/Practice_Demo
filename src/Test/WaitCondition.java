package Test;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCondition {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

	WebDriver driver = new ChromeDriver();
		  // implicit wait 
	  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		  
//		  
		  driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		    driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		    driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		    
		    driver.findElement(By.cssSelector("button.promoBtn")).click();
//		    
//		    // Explicit wait condition 
//		     //WebDriverWait wait =new  WebDriverWait(driver, 5);
//		    
//		   // wait.until(ExpectedConditions.elementToBeClickable(null)))
//		    // above method element to be Clickable means wait to until click on that locator
//		    
//		    //but here we want to check visibility of element so we will use that  method 
//		    
	      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		    
		    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()) ;
	}

}


