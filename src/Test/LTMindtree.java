package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTMindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
	       
	       WebDriver  driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       driver.get("https://www.gsmarena.com/apple_ipad_pro_11_2024-review-2703.php");
	       
	       for(int i =0; i<=6; i++) {
	    	  
	    	   driver.findElement(By.xpath("//div[@id='body']//div[2]//div[2]//a[2]")).click();
	       }
	      
	     
//	       List<WebElement> product = driver.findElements(By.xpath(".col-4-5"));
//	       
//	       for(int i =0; i<=6; i++) {
//		    	  
//	    	   product(By.xpath("//div[@id='body']//div[2]//div[2]//a[2]"));
//	       }
	       

	}

}
