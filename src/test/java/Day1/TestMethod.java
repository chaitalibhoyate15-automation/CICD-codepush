package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMethod {

	public static void main(String[] args) {
		System.out.println("TEST FIRST");
		
		ChromeDriver driver= new ChromeDriver();
		// WebDriver driver = new ChromeDriver();   // ANother way to initialize the browser.
		
		//EdgeDriver driver= new EdgeDriver();
		
		//FirefoxDriver driver= new FirefoxDriver();
		
		
driver.get("https://www.opencart.com/index.php?route=cms/demo");	
driver.manage().window().maximize();
		String actualtitle= driver.getTitle();
		if(actualtitle. equals("Your store")) 
		{System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		driver.close();
		
		
		

	}
	}

