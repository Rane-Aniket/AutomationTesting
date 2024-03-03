package testClasses;

import java.io.IOException;

import org.testng.Assert;
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
		public void launchhrs() throws IOException {
			launchBrowser();
			home = new Homepage();
			list = new Hotelist(driver);
			checkout = new Payment(driver);
		}
		@BeforeMethod
		public void login()
		{
			home.logintoaccount();
		}
		@Test
		public void searchlocation()
		{
			home.searchlocation();
			home.dateopener();
			home.verifymonth();
			home.durationandselect();
			list.verifyhotellist();
			list.firsthoteldetail();
			list.book1kingbed();
			checkout.enterfirstname();
			checkout.enterlastname();
			checkout.enteremail();
			checkout.enternumber();
			checkout.booknow();
			checkout.verifysuccessmessage();
			
			
		}
		@Test
		public void lowavailabilty()
		{
			home.searchlocation();
			home.dateopener();
			home.verifymonth();
			home.durationandselect();
			list.verifyhotellist();
			list.firsthoteldetail();
		}
		
		
		@AfterMethod
		public abstract void logout();
		
		@AfterClass
		public void closebrowser() {
			
			closeBrowser();

		}
	}
