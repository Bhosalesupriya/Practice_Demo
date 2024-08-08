package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDripdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	       dropdown.click();
	      
	      // Parent to child Xpath for Dynamic dropdown
	       
	      driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='GAU']")).click();
	       
	      //dynamic x path with normal but above one is same for it using parent to child 
	       //driver.findElement(By.xpath("//a[@value='GAU']")).click();
	       Thread.sleep(2000);
	       
	       // dynamic dropdown xpath using parent to child x path  for below  indexing x path 
	       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='IXZ']")).click();
	       
	       // dynamic dropdown x path with indexes 
	      // driver.findElement(By.xpath("(//a[@value='IXZ'])[2]")).click();
	       
	       

	       

	}

}
