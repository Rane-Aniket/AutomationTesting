package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
		
		//variables
		@FindBy(xpath = "//input[@id='given-name']")
		private WebElement firstname;
		
		@FindBy(xpath = "//input[@id='family-name']")
		private WebElement lastname;
		
		@FindBy(xpath = "//input[@id='phone']")
		private WebElement phone;
		
		@FindBy(xpath = "//input[@id='email']")
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
		public void enterfirstname(String name)
		{
			firstname.sendKeys(name);
		}
		
		public void enterlastname(String last_name)
		{
			lastname.sendKeys(last_name);
		}
		
		public void enternumber(String phonenumber)
		{
			phone.sendKeys(phonenumber);
		}
		
		public void enteremail(String email_address)
		{
			email.sendKeys(email_address);
		}
		
		public void booknow()
		{
			booknow.click();
		}
		
		public void verifysuccessmessage()
		{
			assert successmessage.isDisplayed();
		}
}
