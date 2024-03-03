package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.baseclass;
import pages.Homepage;
import pages.Hotelist;
import pages.Payment;

public abstract class testbooking extends baseclass
	{
		Homepage home;
		Hotelist list;
		Payment checkout;
		
		@BeforeClass
		public void launchhrs(){
			launchBrowser();    // Given the user in navigated to the HRS portal
			home = new Homepage(driver);
			list = new Hotelist(driver);
			checkout = new Payment(driver);
		}
		
		@BeforeMethod
		public void Login()
		{
			home.loginToAccount("abc@xyz.com"); // And the user enters email and password and click on Login button
		}
		
		@Test
		public void searchLocationAndBook()
		{
			home.searchLocation("Barcelona");            			// When the user searches for the destination 
			home.openDatePicker(); 			    					// And opens the calendar
			home.verifyCalenderMonth("June");   					// Then the user verifies calendar month
			home.selectTravelDuration();        					// When the user selects travel duration and clicks on search button
			list.verifyHotelList();             					// Then the user verifies Hotel list is displayed
			list.checkFirstHotelDetail();       					// When the user clicks on Hotel details for the first hotel
			list.bookOneKingBed();			    					// And books hotel for the room with one king size bed
			checkout.verifyBookingPage("https://www.hrs.com/book"); // Then the user verifies booking page is displayed
			checkout.enterFirstName("TOM");	    					// When enters First name for contact data page
			checkout.enterLastName("HENRY");    					// And enters Last name for contact data page
			checkout.enterEmail("abc@xyz.com"); 					// And enters email address for contact data page
			checkout.enterNumber("1234567890"); 					// And enters phone number for contact data page
			checkout.bookNow(); 									// And clicks on book now button
			checkout.verifySuccessMessage();						// Then the user verifies the success message
		}
		
		@Test
		public void lowAvailabilty()
		{
			home.searchLocation("Barcelona");  // When the user searches for the destination
			home.openDatePicker();			   // And opens the calendar
			home.verifyCalenderMonth("July");  // Then the user verifies calendar month
			home.selectTravelDuration();       // When the user selects travel duration and clicks on search button
			list.verifyHotelList();            // Then the user verifies Hotel list is displayed
			list.lowAvailabilty();             // When the user clicks on Low Availability filter
			list.verifyFilterApplied();        // Then verify if the filter is applied
		}
		
		@AfterMethod
		public abstract void logOut();        //And the user logout from the application
		
		@AfterClass
		public void closeBrowser() 
		{	
			closeBrowser();
		}
	}
