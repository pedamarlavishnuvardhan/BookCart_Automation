package cucumberWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		
	String username = DecodeUtility.decodeSensitiveData("UFZpc2hudVZhcmRoYW4K");
	String password = DecodeUtility.decodeSensitiveData("UHZ2QDEyMzQ1Cgo=");
    
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = BrowserUtility.openBrowser("Chrome");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://bookcart.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.findElement(
			By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]"))
	        .click();
	driver.findElement(By.id("mat-input-0")).sendKeys(username);
	driver.findElement(By.id("mat-input-1")).sendKeys(password,Keys.ENTER);
	//driver.findElement(By.className("mat-button-wrapper")).click();
	
	String expected ="BookCart";
	String actual = driver.getTitle();
	if(expected.equals(actual)) {
		System.out.println("Title: "+actual);
	}
	else {
		System.out.println("Title not matched");
	}
	//driver.quit();
	}

}
