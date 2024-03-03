package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelist {
	    //variables
		@FindBy(xpath = "//div[@id='HotelListId']")
		private WebElement verifylist;
		
		@FindBy(xpath = "(//button[contains(@id,'HotelDetailsButton')])[1]")
		private WebElement firsthoteldetails;
		
		@FindBy(xpath = "//div[contains(text(),'1 KING BED')]/../../following-sibling::div//span[text()='Book now']")
		private WebElement book1kingbed;
		
		
		//constructor
		public Hotelist(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//methods
		public void verifyhotellist()
		{
			assert verifylist.isDisplayed();
		}
		public void firsthoteldetail()
		{
			firsthoteldetails.click();
		}
		public void book1kingbed()
		{
			book1kingbed.click();
		}
}

