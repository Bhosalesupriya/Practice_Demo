package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  // Count the link present on page 
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
			  
			  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    // driver.findElement(By.tagName("a")).size();
		WebElement footerdriver = driver.findElement(By.tagName("gf-BIG"));
		
		footerdriver.findElement(By.tagName("a")).getSize();
		
		
		// now we are ckick in each link present on footer
		
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		  
			//System.out.println( columndriver.findElement(By.tagName("a")).Size());	
		
			// click on each column link and check it's open or not
			
		  // for(int i=1; i < columndriver.findElement(By.tagName("a")).Size(); i++) {
		
		
			   // String clickOnLinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			   //columndriver.findElement(By.tagName("a")).get(i).sendKeys(clickOnLinktab );
		   Thread.sleep(2000);
		   // gating titles of child tab 
			    Set<String> abc = driver.getWindowHandles();
			    Iterator<String> it= abc.iterator();
			    
			    while(it.hasNext())
			    {
			    	driver.switchTo().window(it.next());
			    	System.out.println(driver.getTitle()); 
			    }
			    }
		   //}
		   
		
		
	

}

