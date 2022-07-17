package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class CrossBrowserTest { 
	WebDriver driver; 	
	@Test  
	public void Login() { 	
		driver.get("http://demo.guru99.com/test/newtours/");  
		 WebElement Text_field12=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		  Text_field12.sendKeys("test1");
		  WebElement Text_field13=driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
		  Text_field13.sendKeys("pass123");
		  WebElement btn2=driver.findElement(By.name("submit"));
		  btn2.click();
		}   
	@Parameters({"browser"})    
	@BeforeTest 
	public void beforeTest(String browser) {  
		if(browser.equalsIgnoreCase("chrome")) { 		   
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe"); 	
			driver=new ChromeDriver(); 		  	
			}
		else if (browser.equalsIgnoreCase("edge")) { 
			System.setProperty("webdriver.edge.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Edgepath\\msedgedriver.exe");
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\IEpath\\IEDriverServer.exe");
           driver=new EdgeDriver();
} 	 
}
}
