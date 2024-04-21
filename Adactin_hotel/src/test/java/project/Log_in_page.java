package project;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in_page extends Base_class {
	public  Log_in_page() {
		
		PageFactory.initElements(driver, this);
	}
   @FindBy (id = "username")
   private WebElement name;

   @FindBy  (id = "password")
   private WebElement pass;
   
   @FindBy (id = "login")
   private WebElement log;
   
   
 

public WebElement getName() {
	return name;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLog() {
	return log;
}
void login (String name , String pass )  {
	sendkeys(getName(), name);
	sendkeys(getPass(), pass);
	click(getLog());
	
	
	
	
 
}
}

