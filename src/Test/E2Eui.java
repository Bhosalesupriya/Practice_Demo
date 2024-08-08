package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2Eui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
	       
	       //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	       WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	       dropdown.click();
	       
	       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='GAU']")).click();
	       
		      //dynamic x path with normal but above one is same for it using parent to child 
		       //driver.findElement(By.xpath("//a[@value='GAU']")).click();
		       Thread.sleep(2000);
		       
		       // dynamic dropdown xpath using parent to child x path  for below  indexing x path 
		       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='IXZ']")).click();
              
		       // Calender code : highlighted date at that time we can use this path 
		       
		       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		       
		       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		        
			    // this below Path is for enable/active return date calendar if is enabled than it will return True
				//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		           // why here below we write contains as 1 because  opacity: 1; in HTML page, if u add 0.5 than it will fail 
		        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		        { 
		        	System.out.println("it's Disabled");
		        	  Assert.assertTrue(true);
		        }
		        
		        // if part met condition than elase part will skip 
		        else  
		        {  
		        	Assert.assertTrue(false);
		        }
		        
		        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		        
		        driver.findElement(By.id("divpaxinfo")).click();
		        Thread.sleep(2000);
		        for(int i=1; i<5; i++) {
		        	 driver.findElement(By.id("hrefIncAdt")).click(); 
		        	 // If I want to get that added 5 adults text 
		        	 //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		        }
		       
		        driver.findElement(By.id("btnclosepaxoption")).click();
		        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		        
		       driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
