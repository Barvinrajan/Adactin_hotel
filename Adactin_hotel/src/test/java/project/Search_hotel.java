package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel extends Base_class {
   public Search_hotel() {
	   PageFactory.initElements(driver, this);
   }
   @FindBy (id= "location")
   private WebElement location;
   @FindBy (id = "hotels")
   private WebElement hotels;
   @FindBy (id = "room_type")
   private WebElement roomtype;
   @FindBy (id = "room_nos")
   private WebElement NoOfRooms;
   @FindBy (id = "datepick_in")
   private  WebElement checkin;
   @FindBy (id = "datepick_out")
   private WebElement checkout;
   @FindBy (id = "adult_room")
   private WebElement adults_per;
   @FindBy (xpath = "(//select['@name=child_room'])[2]")
   private WebElement child;
   @FindBy (id = "Submit")
   private WebElement search;
public WebElement getSearch() {
	return search;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoOfRooms() {
	return NoOfRooms;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdults_per() {
	return adults_per;
}
public WebElement getChild() {
	return child;
}
   void search_hotel() {
	   select(getRoomtype(), 2);
	   select(getNoOfRooms(), 1);
	   select(getLocation(), 3);
	   select(getHotels(), 3);
	   select(getChild(), 2);
	   select(getAdults_per(), 1);
	   sendkeys(getCheckin(), "22/09/2023");
	   sendkeys(getCheckout(), "23/09/2023");
	   
	   click(getSearch());
	   
	   
   }

	


   
}
