package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	      // String password =  getpassword(driver);
	       // Navigate to the Tendable website
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	      // Static drop down/ if select Tag-name than that drop dpown is static drop down 
	       WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	       
	       Select a = new Select(dropdown);
	        a.selectByIndex(3);
	        System.out.println(a.getFirstSelectedOption().getText());
	        a.selectByVisibleText("AED");
	        System.out.println(a.getFirstSelectedOption().getText());
	        a.selectByValue("INR");
	        System.out.println(a.getFirstSelectedOption().getText());
	         Thread.sleep(2000);
	        
	       // Updated Drop down means all ready there is some value we need to add again 
	         // if we want to add same product or atom or more number of pepole as quantity 4 or 5 at that time we will use 'While loop' to add more quantity.
	        driver.findElement(By.id("divpaxinfo")).click();
	       /* int i = 1;
	        while(i<5)
	        {
	        	 driver.findElement(By.id("hrefIncAdt")).click(); // 4 time same product or 4 adults will add
	        	 i++;
	        } */
	        
	        for(int i=1; i<5; i++) {
	        	 driver.findElement(By.id("hrefIncAdt")).click(); 
	        	 // If I want to get that added 5 adults text 
	        	 //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	        }
	       
	        driver.findElement(By.id("btnclosepaxoption")).click();
	        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}
	         }
	        



