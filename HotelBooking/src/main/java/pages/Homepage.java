package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.baseclass;

public class Homepage extends baseclass{
	
	//variables
	@FindBy(xpath = "//span[contains(@class,'DestinationSearchOpener')]")
	private WebElement searchbox;
	
	@FindBy(id = "DestinationSearchInput")
	private WebElement inputlocation;
	
	@FindBy(xpath = "(//li[@data-test='DestinationList_suggestionItem'][1])[1]")
	private WebElement clicksuggestion;
	
	@FindBy(id = "DatePickerOpener")
	private WebElement datepickeropener;
	
	@FindBy(xpath = "(//div[@class='Month_title__m8iWe'])[1]")
	private WebElement verifymonth;
	
	@FindBy(xpath = "(//div[contains(@class,'Month_right')])[2]")
	private WebElement nextmonth;
	
	@FindBy(xpath = "(//div[text()='26'])[1]")
	private WebElement fromdate;
	
	@FindBy(xpath = "(//div[text()='1'])[2]")
	private WebElement enddate;
	
	@FindBy(id = "SearchHotelsButton")
	private WebElement searchhotel;
	
	@FindBy(xpath = "(//span[text()='Log in'])[1]")
	private WebElement loginbutton;
	
	@FindBy(id = "email")
	private WebElement emaillogin;
	
	@FindBy(id = "password")
	private WebElement loginpassword;
	
	@FindBy(xpath = "(//span[text()='Log in'])[4]")
	private WebElement popuploginbutton;
	
	
	//constructor
	public Homepage() 
	{
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
