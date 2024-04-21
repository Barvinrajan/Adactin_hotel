package project;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	static WebDriver driver;
	
	static public void browser_la() {
		driver= new EdgeDriver();
	}
		static void get_url(String string) {
			driver.get(string);
		}
	//public  WebElement findelement_id (String string) {
		//WebElement element = driver.findElement(By.xpath(string));
		//return element;
	//}
	void sendkeys(WebElement element , String string ) {
		element.sendKeys(string);
	}
	 public static String get_text (int Sheet , int row1 , int column1) throws InvalidFormatException, IOException {
   	  File file = new File("C:\\Users\\BARVINRAJAN\\eclipse-workspace\\Datadriven\\excelsheet\\jj.xlsx");
   	  Workbook book = new XSSFWorkbook(file);
   	  
   	  Sheet sheet = book.getSheetAt(Sheet);
   	  Row row = sheet.getRow(row1);
   	  Cell cell = row.getCell(column1);
   	  String value = cell.getStringCellValue();
   	  System.out.println(value);
   	  return value;
     }
	 void click(WebElement element) {
		 element.click();}
     void select (WebElement element, int a) {
    	 Select s = new  Select(element);
    	 s.selectByIndex(a);
    	
     }
     void take_screenshot (WebElement element , String s ) throws IOException {
    	 TakesScreenshot tk = (TakesScreenshot)element;
    	File from = tk.getScreenshotAs(OutputType.FILE);
    	File to = new File(s);
    	FileHandler.copy(from, to);
    	
    	
    	
    	 
     }
	 }

