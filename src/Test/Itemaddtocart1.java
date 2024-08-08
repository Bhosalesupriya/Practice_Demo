package Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemaddtocart1 {

//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//
//		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");
//		
//		  WebDriver driver = new ChromeDriver();
//			
//			
//		   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		   Thread.sleep(3000);
//		   
//		 // we added the more item 
//		   // String[] itemsneeded  = {"Brocolli - 1 Kg","Beetroot - 1 Kg", "Beans - 1 Kg"};
//		   String[] itemsneeded  = {"Brocolli","Cauliflower", "Beetroot","Beans"};
//		   int j=0;
//		   
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));                                           
//		   
//			 for(int i =0; i<products.size(); i++) 
//			 {
//				 
//				//String name = products.get(i).getText();	
//				 
//				 //Brocolli - 1 Kg  > once splited the Brocoli - 1 kg with hypen  , left 0 index shows Brocoli and  right side at 1 index 1kg 
//				 
//				 
//				 String[] name = products.get(i).getText().split("-");	
//				 String formattedname = name[0].trim();
//				 
//	                                          			
//				//convert array in to array list for  better search                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
//				
//				// contains method is simple method use to help u whether item what u have presented in arraylist or not 
//				
//				List<String> listitem = Arrays.asList(itemsneeded);
//				
//			
//				
//				
//	if (listitem.contains(formattedname))
//	{
//				{
//			j++;
//            driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
////                 we can write above xpath : "//div[@class='product-action']/button"
//            
//            
////               if added j ==3 because above in string array we added only 3 items >{"Brocolli","Cauliflower", "Beetroot"}
////            but if we want to make it dynamic means if we added more item than automatically 
////            number of execution of j should execute at same of array item (it means if we added the 4 items than automatically block will execute 4 times and i block we come out
//            
//            
////                  if(j==3)
//             if(j==itemsneeded.length)
//                    {
//            	       break;
//                     }
//				}
//	}
//}
//}

	
	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4
	
	
	// below script for create a simple method with static keyword so no need to create object u can directly call method 
	// else u can create a method without static keyword than create class object and call the method 
	
	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");
		
		  WebDriver driver = new ChromeDriver();
		
		  
		  //Thread.sleep(3000);
	       
		   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		   
		   //driver.manage().timeouts().implicitlyWait(1,  TimeUnit.SECONDS) ;
		   
		 // we added the more item 
		   // String[] itemsneeded  = {"Brocolli - 1 Kg","Beetroot - 1 Kg", "Beans - 1 Kg"};
		   String[] itemsneeded  = {"Brocolli","Cauliflower", "Beetroot","Beans"};
		   //addItems(driver, itemsneeded);
		   
		   // if u create a method without static keyword than u need to create object of a class 
		   
		    Itemaddtocart1 obj = new Itemaddtocart1();
		   obj.addItems(driver, itemsneeded);
		   
		   // Here we are clicking on cart added item and checking amount and proceed further 
		   
		    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		    driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		    driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		    driver.findElement(By.cssSelector("button.promoBtn")).click();
		   System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()) ;
		    
		   
	}
		public  void addItems(WebDriver driver, String[] itemsneeded){
			 int j=0;
			   
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));                                           
				   
					 for(int i =0; i<products.size(); i++) 
					 {
						 
						//String name = products.get(i).getText();	
						 
						 //Brocolli - 1 Kg  > once splited the Brocoli - 1 kg with hypen  , left 0 index shows Brocoli and  right side at 1 index 1kg 
						 
						 
						 String[] name = products.get(i).getText().split("-");	
						 String formattedname = name[0].trim();
						 
			                                          			
						//convert array in to array list for  better search                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
						
						// contains method is simple method use to help u whether item what u have presented in arraylist or not 
						
						List<String> listitem = Arrays.asList(itemsneeded);
						
					
						
						
			if (listitem.contains(formattedname))
			{
						{
					j++;
		            driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
//		                 we can write above xpath : "//div[@class='product-action']/button"
		            
		            
//		               if added j ==3 because above in string array we added only 3 items >{"Brocolli","Cauliflower", "Beetroot"}
//		            but if we want to make it dynamic means if we added more item than automatically 
//		            number of execution of j should execute at same of array item (it means if we added the 4 items than automatically block will execute 4 times and i block we come out
		            
		            
//		                  if(j==3)
		             if(j==itemsneeded.length)
		                    {
		            	       break;
		                     }
						}
			}
}
}
	
	
}
