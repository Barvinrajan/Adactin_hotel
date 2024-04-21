package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Itinerary extends Base_class {
	public Book_Itinerary() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//a['@href=BookedItinerary.php'])[2]")
	private WebElement book_it; 
	 @FindBy (id="order_id_text")
	private WebElement search;
	 @FindBy (id= "search_hotel_id")
	 private WebElement go;
	 @FindBy (id="check_all")
	 private WebElement checkbox;
public WebElement getCheckbox() {
		return checkbox;
	}
public WebElement getBook_it() {
		return book_it;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getGo() {
		return go;
	}

void book_i() throws InterruptedException {
	click(getBook_it());
	sendkeys(getSearch(), "6ME61V1112");
	click(getGo());
	
	click(getCheckbox());
	
}}