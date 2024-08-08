package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		//sibling -  parent to child to next child travel 
		 //System.setProperty("WebDriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.33.0-win64");
	
		 //WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	      //driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	      
	      // travel from child to parent 
	      System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	      
		  
		  
	       
	       
	       
	}

}
