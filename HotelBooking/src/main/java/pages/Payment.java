package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
		
		//variables
		@FindBy(id = "given-name")
		WebElement firstname;
		
		@FindBy(id = "family-name")
		WebElement lastname;
		
		@FindBy(id = "phone")
		WebElement phone;
		
		@FindBy(id = "email")
		WebElement email;
		
		@FindBy(xpath = "//span[text()='Book now']/../")
		WebElement booknow;
		
		@FindBy(xpath = "//div[text()='Success']")
		WebElement successmessage;
	
	
		//constructor
		WebDriver ldriver;
		public Payment(WebDriver driver) {
			ldriver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//methods
		public void enterFirstName(String name)
		{
			firstname.sendKeys(name);
		}
		
		public void enterLastName(String last_name)
		{
			lastname.sendKeys(last_name);
		}
		
		public void enterNumber(String phonenumber)
		{
			phone.sendKeys(phonenumber);
		}
		
		public void enterEmail(String email_address)
		{
			email.sendKeys(email_address);
		}
		
		public void bookNow()
		{
			booknow.click();
		}
		
		public void verifySuccessMessage()
		{
			assert successmessage.isDisplayed();
		}
		
		public void verifyBookingPage(String expected_url)
		{
			String found_url = ldriver.getCurrentUrl();
			assert found_url == expected_url;
		}
}
