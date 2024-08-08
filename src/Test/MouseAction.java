package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
			  
			  driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_1rlu76yi08_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=155852&hvtargid=kwd-82189526801617:loc-90&hydadcr=14452_2334185\");\r\n");
			
			  // MOVE TO particular element using mouse 		  
	
               Actions a = new Actions(driver);
               
			 // context click method is use to right click on page 
               a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick(). build().perform();	
               
               // we click on search bar and enter a 'hello' word in capital using shift key and mouse action  

 			  // we can select the enter hello words using 'double click' on it using mouse action 
 			  
			  
			  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
			  
	}

}
