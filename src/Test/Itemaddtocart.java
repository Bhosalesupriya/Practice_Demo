package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		
		  WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		   
		 // we added the one item 
		                              
		   List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));                                           
		   
			 for(int i =0; i<product.size(); i++) 
			 {
				String name = product.get(i).getText();	
	                                          			
				//convert array in to array list for  better search                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
				
				// contains method is simple method use to help u whether item what u have presented in arraylist or not 
				if (name.contains("Cucumber - 1 Kg"))
				{
              driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
              break;
				}
	  }
			 
	}
}

