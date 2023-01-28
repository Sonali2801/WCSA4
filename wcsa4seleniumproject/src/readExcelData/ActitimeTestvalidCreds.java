package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestvalidCreds {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://127.0.0.1/login.do");
	
	Thread.sleep(2000);
	FileInputStream fis = new FileInputStream("./data/Actitime Testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("validcreds");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String username = cell.getStringCellValue();
	
	FileInputStream fis1 = new FileInputStream("./data/Actitime Testdata.xlsx");
	Workbook wb1 = WorkbookFactory.create(fis1);
	Sheet sheet1 = wb1.getSheet("validcreds");
	Row row1 = sheet1.getRow(1);
	Cell cell1 = row1.getCell(1);
	String password = cell1.getStringCellValue();
	
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys(password);
	 Thread.sleep(2000);
}
}
