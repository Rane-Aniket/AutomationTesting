package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
		
		//variables
		@FindBy(id = "given-name")
		private WebElement firstname;
		
		@FindBy(id = "family-name")
		private WebElement lastname;
		
		@FindBy(id = "phone")
		private WebElement phone;
		
		@FindBy(id = "email")
		private WebElement email;
		
		@FindBy(xpath = "//span[text()='Book now']/../")
		private WebElement booknow;
		
		@FindBy(xpath = "//div[text()='Success']")
		private WebElement successmessage;
	
	
		//constructor
		public Payment(WebDriver driver) {
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
}
