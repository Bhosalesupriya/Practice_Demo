package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
			  
			  driver.get("https://jqueryui.com/droppable/");
			  
			  // if we want to check how many frame are present on web page below is syntax
				//System.out.println(  driver.findElement(By.tagName("iframe")).size())  ;  
			  // we are handling frame so first we will swtich the focus 
			  
			  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
			  
			  
			  Actions a= new Actions(driver);
			   WebElement source = driver.findElement(By.id("draggable"));
			   WebElement target = driver.findElement(By.id("droppable"));
			   
			   a.dragAndDrop(source, target).build().perform();
			   
			   // if we want to remove the focus of iframe than we will use the default content method 
			   
			   driver.switchTo().defaultContent();
			   
			  
	}

}
