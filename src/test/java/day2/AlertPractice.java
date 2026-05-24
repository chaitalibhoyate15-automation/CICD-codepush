package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
	
			ChromeDriver driver= new ChromeDriver();
			// WebDriver driver = new ChromeDriver();   // ANother way to initialize the browser.
			
			//EdgeDriver driver= new EdgeDriver();
			
			//FirefoxDriver driver= new FirefoxDriver();
			
			
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
	driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@sonclick=\"jsAlert()\"]")).click();
	Thread.sleep(5000); // Throws interuptedException 

		// To switch to the window and accept the window popup.
		//driver.switchTo().alert().accept();
		//or
		/* Alert  popupaccept= driver.switchTo().alert();
		System.out.println(popupaccept.getText());
		popupaccept.accept();
		//driver.close(); */
		
		 /*driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		 Thread.sleep(5000); 
		 Alert confirmalert=driver.switchTo().alert();
		 System.out.println(confirmalert.getText());
		 confirmalert.accept(); */
		 
		 driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		 Thread.sleep(5000); 
		 Alert confirmalert=driver.switchTo().alert();
		 System.out.println(confirmalert.getText());
		 confirmalert.dismiss();
		
		
		
	}

}
