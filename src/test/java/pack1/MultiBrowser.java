package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class MultiBrowser { 
	WebDriver driver; 	
	@Test  
	public void multiBrowserTest() { 	
		driver.get("http://demo.guru99.com/test/newtours/");  
		}   
	@Parameters({"browser"})    
	@BeforeTest   public void beforeTest(String browser) {  
		if(browser.equalsIgnoreCase("chrome")) { 		   
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe"); 	
			driver=new ChromeDriver(); 		  	
			}else if (browser.equalsIgnoreCase("ie")) {  	
			System.setProperty("webdriver.ie.driver", "D:\\selenium\\IEDriverServer.exe");
}
 driver=new InternetExplorerDriver();
} 	 
}
