package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel2 extends Base_class {
	public Search_hotel2 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id= "radiobutton_0")
	private WebElement select;
	@FindBy (id= "continue")
	private WebElement cont;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCont() {
		return cont;
	}
	void Hotel_select() {
		click(getSelect());
		click(getCont());
	}

}
