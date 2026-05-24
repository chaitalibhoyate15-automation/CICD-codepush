package handleframe;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleiframe {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver(); // ANother way to initialize the
		// browser.

		// EdgeDriver driver= new EdgeDriver();

		// FirefoxDriver driver= new FirefoxDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		// https://ui.vision/demo/webtest/frames/
		
		//https://ui.vision/demo/webtest/frames/frame_1
		
		
		
		//https://demo.automationtesting.in/Frames.html
	WebElement frame1=	driver.findElement(By.xpath("//a[@href=\"#Single\"]"));
		
		driver.switchTo(). frame(frame1);//passes frame as WebElement switch to frame one.

		//from one frame to another we cannot directly switch we need to go back to default page and from there we need to switch to another Frame
		//driver.switchTo().defaultContent();
		
	}

}
