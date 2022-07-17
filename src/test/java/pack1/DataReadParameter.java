package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DataReadParameter {
	WebDriver driver;
	
  @Test
  @Parameters({"username","password"})
  public void logIn(String uservalue,String passvalue) {
	  WebElement username=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	  username.sendKeys(uservalue);
	  WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	  password.sendKeys(passvalue);
	  WebElement btn2=driver.findElement(By.name("submit"));
	  btn2.click();
	  //String expectedUrl = ""
	
  }
  @BeforeTest
  public void beforeTest() {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
  }

}
