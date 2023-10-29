package bookCart.PageObjectModelClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	WebDriver driver;
	
	By username = By.xpath("//*[@id='mat-input-0']");
	By password = By.id("mat-input-1");
	By login = By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-card-actions/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void performLoginOperation(String uname, String pswrd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pswrd);
		driver.findElement(login).click();
		
	}
	
}
