package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	
	//variables
	@FindBy(xpath = "//span[contains(@class,'DestinationSearchOpener')]")
	WebElement searchbox;
	
	@FindBy(id = "DestinationSearchInput")
	WebElement inputlocation;
	
	@FindBy(xpath = "(//li[@data-test='DestinationList_suggestionItem'][1])[1]")
	WebElement clicksuggestion;
	
	@FindBy(id = "DatePickerOpener")
	WebElement datepickeropener;
	
	@FindBy(xpath = "(//div[@class='Month_title__m8iWe'])[1]")
	WebElement verifymonth;
	
	@FindBy(xpath = "(//div[contains(@class,'Month_right')])[2]")
	WebElement nextmonth;
	
	@FindBy(xpath = "(//div[text()='26'])[1]")
	WebElement fromdate;
	
	@FindBy(xpath = "(//div[text()='1'])[2]")
	WebElement enddate;
	
	@FindBy(id = "SearchHotelsButton")
	WebElement searchhotel;
	
	@FindBy(xpath = "(//span[text()='Log in'])[1]")
	WebElement loginbutton;
	
	@FindBy(id = "email")
	WebElement emaillogin;
	
	@FindBy(id = "password")
	WebElement loginpassword;
	
	@FindBy(xpath = "(//span[text()='Log in'])[4]")
	WebElement popuploginbutton;
	
	
	//constructor
	WebDriver ldriver;
	public Homepage(WebDriver driver) 
	{
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void searchLocation(String location)
	{
		searchbox.click();
		inputlocation.sendKeys(location);
		clicksuggestion.click();
		
	}
	
	public void openDatePicker()
	{
		datepickeropener.click();
	}
	
	public void verifyCalenderMonth(String exp_month)
	{
		String found_month = verifymonth.getText();
		while(!found_month.equals(exp_month))
		{
			nextmonth.click();
		}
	}
	
	public void selectTravelDuration()
	{
		fromdate.click();
		enddate.click();
		searchhotel.click();
	}
	
	public void loginToAccount(String email)
	{
		loginbutton.click();
		emaillogin.sendKeys(email);
		loginpassword.sendKeys("ABCD1234");
		popuploginbutton.click();	
	}
}
