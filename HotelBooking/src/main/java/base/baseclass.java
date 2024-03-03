package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseclass {
public static WebDriver driver;
	

	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hrs.com/");
//		Reporter.log("Lauching browser..", true);

	}

	public void closeBrowser() {
		driver.quit();
//		Reporter.log("Closing browser..", true);
	}

}
