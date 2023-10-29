package cucumberWithSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bookCart.PageObjectModelClass.HomePage;
import bookCart.PageObjectModelClass.LoginPage;

public class LoginTest {
	WebDriver driver;
	HomePage homepage;
	LoginPage login;
	
	@BeforeTest
	public void configureBrowser() {
		driver  = BrowserUtility.openBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeApplication() {
	  driver.close();
	}
	
   @Test
	public void UserLoginTest() {
		driver.get("https://bookcart.azurewebsites.net/");
		
		homepage =new HomePage(driver);
		homepage.navigateToLoginPage();
		
		login = new LoginPage(driver);
		String username = DecodeUtility.decodeSensitiveData("UFZpc2hudVZhcmRoYW4K");
		String password = DecodeUtility.decodeSensitiveData("UHZ2QDEyMzQ1Cgo=");
		login.performLoginOperation(username, password);
		System.out.println("Title: "+driver.getTitle());
		System.out.println("HI");
			
	}
    
}
