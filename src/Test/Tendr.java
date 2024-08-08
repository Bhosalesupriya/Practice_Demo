package Test;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
public class Tendr {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tendable.com");
		
		
		 confirmAccessibility(driver, "//img[@alt='Tendable Logo']");
		 confirmAccessibility(driver, "//a[contains(text(),'Our Story')]");
		 confirmAccessibility(driver, "//a[contains(text(),'Our Solution')]");
		 confirmAccessibility(driver, "//a[contains(text(),'Why Tendable?')]");
		 
		 verifyRequestDemoButton(driver, "//img[@alt='Tendable Logo']");
		 verifyRequestDemoButton(driver, "//a[contains(text(),'Our Story')]");
		 verifyRequestDemoButton(driver, "//a[contains(text(),'Our Solution')]");
		 verifyRequestDemoButton(driver, "//a[contains(text(),'Why Tendable?')]");
		 
		 verifyContactUs(driver, "//a[contains(text(),'Contact Us')]");
		 
		}
		
		
		public static void confirmAccessibility(WebDriver driver, String xpath) throws InterruptedException {
		   
		        WebElement menuButton = driver.findElement(By.xpath(xpath));
		    	driver.manage().window().maximize();
		    	Thread.sleep(2000);
		    	String pName = menuButton.getText();
		    	 String[] mName = menuButton.getText().split(" ");
		            String menuName = mName[0];
		        if (menuButton.isDisplayed()) {
		           
		            menuButton.click();	         
		            String currentURL = driver.getCurrentUrl();
	               
		            if (currentURL.contains(menuName.toLowerCase())) {
		                System.out.println("The " +pName  +"menu takes you to the correct page.");
		            } else {
		              
		                System.out.println("The "  +pName  + "menu did not take you to the correct page.");
		            }
		        }
		         else {
		            System.out.println("The " +pName  + "menu button is not present on the page.");
		        }	        	        
	}

	    public static void verifyRequestDemoButton(WebDriver driver, String menuPath) {
		       
	            driver.findElement(By.xpath(menuPath)).click();
	    	WebElement reqDemoButton = driver.findElement(By.xpath("//header/div[1]/div[1]/a[3]"));
	    	String pName =driver.findElement(By.xpath(menuPath)).getText();

	    	if(reqDemoButton.isDisplayed()|| reqDemoButton.isEnabled()) {
	    		
	    		System.out.println("Request demo is present in " +pName +" menu and Request demo is active");
	    		}
	    	   	
	    	else {
	    		System.out.println("Request demo is NOT available in " +pName +" menu");
	    	}
	    	}
	    	
	    	
	   public static void verifyContactUs(WebDriver driver, String homeContact) throws InterruptedException {
		   
		   driver.findElement(By.xpath(homeContact)).click();
		   String marketContact =   "(//button[@class='body-button bg-plain-600 toggle-control'][normalize-space()='Contact'])[1]";
			String fullName ="(//input[@id='form-input-fullName'])[1]";
			String organization ="(//input[@id='form-input-organisationName'])[1]";
			String phone ="(//input[@id='form-input-cellPhone'])[1]";
			String email ="(//input[@id='form-input-email'])[1]";
			String jobRole = "(//select[@id='form-input-jobRole'])[1]";
			String radioButton="//div[@class='fixed right-0 top-1/4 z-50 px-3.5 xl:px-7 py-3 bg-transparent flex flex-col space-y-3']";
			String submit ="//form[@id='contactMarketingPipedrive-163701']//label[contains(text(),'I Agree')]";
			String errorMsg="/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]";
			
		   driver.findElement(By.xpath(marketContact)).click();
		   driver.findElement(By.xpath(fullName)).sendKeys("Rahul");
		   driver.findElement(By.xpath(organization)).sendKeys("MNC");
		   driver.findElement(By.xpath(phone)).sendKeys("903998398938");
		   driver.findElement(By.xpath(email)).sendKeys("rahul124@gmail.com");

		  WebElement dropdown= driver.findElement(By.xpath(jobRole));
		  
		  Select select = new Select(dropdown);
		  select.selectByVisibleText("Management");
		  JavascriptExecutor js = (JavascriptExecutor) driver;

	      js.executeScript("window.scrollBy(0, 500);");
	   
	      WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
	      WebElement radButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(radioButton)));
	      
	      //Point elementLocation = radButton.getLocation();
	     
	     
	      int maxAttempts = 3; 
	      long retryInterval = 1000; 
	      
	      for (int attempt = 1; attempt <= maxAttempts; attempt++) {
	    	    try {
	    	    	 Actions actions = new Actions(driver);
	    	         
	    	         actions.doubleClick(radButton).perform();
	    	        break;  // If the click is successful, exit the loop
	    	    } catch (ElementNotInteractableException e) {
	    	        if (attempt < maxAttempts) {
	    	            try {
	    	                Thread.sleep(retryInterval);
	    	            } catch (InterruptedException sleepException) {
	    	                Thread.currentThread().interrupt();
	    	            }
	    	        } else {
	    	            throw new RuntimeException("Element not interactable after max attempts.");
	    	        }
	    	    }
	    	}
	      
	      
	     Actions actions = new Actions(driver);
	      
	      actions.doubleClick(radButton).perform();
	      
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      //WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submit)));

	     // submitButton.click();	
	      WebElement submitButton = driver.findElement(By.xpath("//button[contains(@data-loading-text,'Loading...')][normalize-space()='Submit'][1]")); 
		   //WebElement submitButton = driver.findElement(By.xpath("//button[contains(@class,'button')]"); 
	      // Regular expression    
	      submitButton.click();
	       
		  String ActualError = driver.findElement(By.xpath(errorMsg)).getText();
		  String ExpectedError = "Sorry, there was an error submitting the form. Please try again.";

		 if(ExpectedError.contains(ActualError)){
			 System.out.println("error message displayed successfully. Test Passed");
		 }
		 else {
			 System.out.println("error message displayed successfully. Test Failed");

		 }
		 //driver.quit();
		 }
	}


