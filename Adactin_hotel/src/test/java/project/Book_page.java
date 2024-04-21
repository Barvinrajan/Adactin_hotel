package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_page extends Base_class {
    public Book_page () {
    	PageFactory.initElements(driver, this);
    }
    @FindBy (id= "first_name")
    private WebElement f_name;
    @FindBy (id="last_name")
    private WebElement l_name;
    @FindBy (id ="address" )
    private WebElement bill_add;
    @FindBy (id="cc_num" )
    private WebElement credit_num ;
    @FindBy (id= "cc_type")
    private WebElement credit_cardtype;
    @FindBy (id="cc_exp_month")
    private WebElement sel_month;
    @FindBy (id= "cc_exp_year")
    private WebElement sel_year;
    @FindBy (id= "cc_cvv" )
    private WebElement ccv_num;
    @FindBy (id="book_now")
    private WebElement bookclick;
	public WebElement getBookclick() {
		return bookclick;
	}
	public WebElement getF_name() {
		return f_name;
	}
	public WebElement getL_name() {
		return l_name;
	}
	public WebElement getBill_add() {
		return bill_add;
	}
	public WebElement getCredit_num() {
		return credit_num;
	}
	public WebElement getCredit_card() {
		return credit_cardtype;
	}
	public WebElement getSel_month() {
		return sel_month;
	}
	public WebElement getSel_year() {
		return sel_year;
	}
	public WebElement getCcv_num() {
		return ccv_num;
	}
	void book (String num , String n) {
		sendkeys(getF_name(), n);
		sendkeys(getL_name(), "rajan");
		sendkeys(getBill_add(), "No-23, Omr rood, karapakkam , + chennai");
		sendkeys(getCredit_num(), num);
		select(getCredit_card(), 1);
		select(getSel_month(), 2);
		select(getSel_year(), 19);
		sendkeys(getCcv_num(), "786");
		click(getBookclick());
	}
    
}


