package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelist {
	    
		//variables
		@FindBy(id = "HotelListId")
		private WebElement verifylist;
		
		@FindBy(xpath = "(//button[contains(@id,'HotelDetailsButton')])[1]")
		private WebElement firsthoteldetails;
		
		@FindBy(xpath = "//div[contains(text(),'1 KING BED')]/../../following-sibling::div//span[text()='Book now']")
		private WebElement book1kingbed;
		
		@FindBy(xpath = "//label[contains(@for,'LOWAVAILABILTY')]")
		private WebElement lowavailabiltyfilter;
		
		@FindBy(xpath = "")
		private WebElement verifyfilterapplied;
		
		
		//constructor
		public Hotelist(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//methods
		public void verifyHotelList()
		{
			assert verifylist.isDisplayed();
		}
		
		public void checkFirstHotelDetail()
		{
			firsthoteldetails.click();
		}
		
		public void bookOneKingBed()
		{
			book1kingbed.click();
		}
		
		public void lowAvailabilty()
		{
			lowavailabiltyfilter.click();
		}
		
		public void verifyFilterApplied()
		{
			
		}
}

