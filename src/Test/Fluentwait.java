package Test;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.function.Function;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

	WebDriver driver = new ChromeDriver();
	
		
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
        
        driver.findElement(By.xpath("//button[@id='button00']")).click();
     // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(3))
            .ignoring(NoSuchElementException.class);
        
//        WebElement foo = wait.until( new Function <WebDriver, WebElement>() {
//        	
//            public WebElement apply(WebDriver driver) 
//            {
//              return driver.findElement(By.xpath("//button[@id='button01']"));
//            }
//        });
        
	}
}

