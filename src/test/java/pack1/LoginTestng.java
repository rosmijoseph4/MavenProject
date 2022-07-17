package pack1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestng {
	WebDriver driver;
	
  @Test
  public void login() {
	  WebElement Text_field12=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	  Text_field12.sendKeys("test1");
	  WebElement Text_field13=driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
	  Text_field13.sendKeys("pass123");
	  WebElement btn2=driver.findElement(By.name("submit"));
	  btn2.click();
	  //String expectedUrl = ""
	
	  
  }
  @Test
  public void test2() {
	  System.out.println("Second Test case");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

 

}
