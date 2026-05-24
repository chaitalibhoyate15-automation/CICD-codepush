package handlingAlertwithoutSwitch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlealertwithexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//WebDriverwait mywait= new webDriverwait(driver,Duration.ofSeconds(10));
		
		driver.get("\"https://admin:admin@the-internet.herokuapp.com/basic_auth\"");	
		driver.manage().window().maximize();
				

		// 3rd method to capture the alert using explicit wait
		WebDriverWait mywait= new WebDriverWait(driver, Duration. ofSeconds(10));

		driver.findElement(By.xpath("//button[@onclick=\'jsPrompt()']")).click();


		Alert myalert= mywait.until(ExpectedConditions. alertIsPresent());

		System.out.println(myalert.getText());

		
		
		
		
		
		
		
		
	}

}
