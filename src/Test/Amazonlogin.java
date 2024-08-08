package Test;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_1rlu76yi08_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=155852&hvtargid=kwd-82189526801617:loc-90&hydadcr=14452_2334185");
         
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        //driver.findElement(By.className("nav-action-inner")).click();

        FileInputStream f = new FileInputStream(".\\DataExcelFolder\\Excelgmail.xlsx");
        
        //Sheet work = WorkbookFactory.create(f).getSheetAt(0);
        
        XSSFWorkbook workbook = new XSSFWorkbook(f);
        XSSFSheet sheet = workbook.getSheetAt(0);  // sheet1 starts from 0 index 
         
        String email = sheet.getRow(0).getCell(0).getStringCellValue();
        
         
    // Close the file input and output streams
      workbook.close();
      // fileout.close();

       // Enter the email in the input field
       driver.findElement(By.id("ap_email")).sendKeys(email);

       // Click the continue button
       driver.findElement(By.id("continue")).click();
       String password = sheet.getRow(0).getCell(1).getStringCellValue();
       
       driver.findElement(By.id("ap_password")).sendKeys(password);
       driver.findElement(By.id("signInSubmit")).click();
       // Close the workbook and the file input stream
       //s.close();
	}

}


