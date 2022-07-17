package package8;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GoodbitsDemo {
	WebDriver driver;
  @Test
  public void logIn() {
	 WebElement user_name= driver.findElement(By.name("username"));
	 user_name.sendKeys("test@goodbits.in");
	// WebElement password=driver.findElement(By.xpath("//input[@id=\\\"password\"\\]"));
	 WebElement password=driver.findElement(By.id("password"));
	 password.sendKeys("Password@123");
	
	 WebElement submit=driver.findElement(By.xpath("//input[@class='_2Ez6yM']"));
	 submit.click();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://d1nk8mqr63ylzc.cloudfront.net/login");
	  driver.manage().window().maximize();
  }

}
