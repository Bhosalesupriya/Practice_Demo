package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\ChromeStandaloneSetup64");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
			  
			  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			  driver.findElement(By.cssSelector(".blinkingText")).click();
			  
			  // how to switch the focus of one window or tab to another window or tab 
			  
			  Set<String> windows = driver.getWindowHandles();
			  
		   //itrator we are using to fetch the ID of child window 
			   Iterator <String > it= windows.iterator();
			   
			   String ParentID = it.next();
			   String chaildID = it.next();
			   driver.switchTo().window(chaildID);     

	String emailId =   driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(ParentID);

	driver.findElement(By.id("username")).sendKeys(emailId);
}
}

