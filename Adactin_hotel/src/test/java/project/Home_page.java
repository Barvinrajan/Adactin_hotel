package project;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.Browser;

public class Home_page extends Base_class {
	@BeforeClass
	static public void lb() {
		browser_la();
		get_url("https://adactinhotelapp.com/");
		
	}
	@Test
     public void login () throws InvalidFormatException, IOException, InterruptedException {
	     Log_in_page l = new Log_in_page();
	     l.login(get_text(0, 0, 0), get_text(0, 0, 1));
	     
	     Search_hotel s= new Search_hotel();
	     s.search_hotel();
	     Search_hotel2 s1 = new Search_hotel2();
	     s1.Hotel_select();
	    		 Thread.sleep(4000);
	     Book_page b= new Book_page();
	    b.book("1234567891234567", "barviin");
	    
	    
	    
	   Book_Itinerary book= new  Book_Itinerary ();
	    book.book_i();
	    //Thread.sleep(4000);
	     
	     Logout_page log = new Logout_page();
	     log.out();
	     
	     driver.close();
	     
	     
	     
	     
	}
	   
   }

