package handlingAlertwithoutSwitch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleauthentictedpopup {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		// WebDriver driver = new ChromeDriver();   // ANother way to initialize the browser.
		
		//EdgeDriver driver= new EdgeDriver();
		
		//FirefoxDriver driver= new FirefoxDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// format- "https://usernamevalue:passwordvalue@and rest of the URL");

		
		//https://testautomationpractice.blogspot.com/-- assignment
//https://the-internet.herokuapp.com/basic_auth ---- popup with creds url


		

	}

}
