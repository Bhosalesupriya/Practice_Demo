package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	     
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
        // AutoSuggestive DropDown X-path 
        
        driver.findElement(By.id("autosuggest")).sendKeys("IND");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for(WebElement option :options)
        { 
       	 if (option.getText().equalsIgnoreCase("India"))
       			 {option.click();
       			 break;		 }
        

	}

}
}
