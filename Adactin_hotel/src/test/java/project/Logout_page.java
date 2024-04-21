package project;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page extends Base_class {
	public Logout_page () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath =  "(//input['@name=logout'])[19]")
	private WebElement logout;
	@FindBy (xpath= "(//img['@alt=AdactIn Group'])[2]")
	private WebElement take_s;
	public WebElement getTake_s() {
		return take_s;
	}
	public WebElement getLogout() {
		return logout;
	}
	void out() throws IOException, InterruptedException {
		//take_screenshot(getTake_s(), "C:\\Users\\BARVINRAJAN\\eclipse-workspace\\Selenium1\\Image\\new.png");
		//Thread.sleep(4000);
		click(getLogout());
	}

}
