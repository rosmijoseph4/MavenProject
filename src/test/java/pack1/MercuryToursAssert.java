package pack1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class MercuryToursAssert {
	WebDriver driver;
	
  @Test(priority=1,description="TC_001 Verify title of the web page",enabled=true)
  public void verifyTitle() {
	String actual_title=  driver.getTitle();
	String expected_title="Welcome: Mercury Tours";
	//Assert.assertEquals(actual_title,expected_title,"Title not match");
 SoftAssert sa = new SoftAssert();
 sa.assertEquals(actual_title,expected_title,"Title not match");
  }
  
  @Test(description="TC_002 Verify the URL of the current page",enabled=true)
  public void verifyUrl() {
	String actual_url=  driver.getCurrentUrl();
	String expected_url="https://demo.guru99.com/test/newtours/";
	//Assert.assertEquals(actual_url,expected_url,"Url not match");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actual_url, expected_url,"Url not match");
  }

  @Test(priority=2,description="TC_003 Verify whether username field is enabled and displayed",enabled=true)
  public void verifyUsername() {
  
	 WebElement user_name= driver.findElement(By.name("userName"));
	//Assert.assertTrue(user_name.isDisplayed()); 
	 SoftAssert sa=new SoftAssert();
	 sa.assertTrue(user_name.isDisplayed());
	}
  @Test(priority=3,description="TC_004 Verify whether password field is enabled and displayed",enabled=true)
  public void verifyPassword() {
	WebElement pass_word= driver.findElement(By.name("password")); 
	Assert.assertTrue(pass_word.isDisplayed());
  }
  
  @Test(priority=4,description="TC_005 Verify whether user is able to login",enabled=true)
  public void logIn() {
	  WebElement user_name= driver.findElement(By.name("userName"));
	  Assert.assertTrue(user_name.isDisplayed());
	 user_name.sendKeys("test1");
	  WebElement pass_word= driver.findElement(By.name("password"));
	  Assert.assertTrue(pass_word.isDisplayed());
	  pass_word.sendKeys("pass123");
	 WebElement submit= driver.findElement(By.name("submit"));
	 submit.click();
	 String actual_title=driver.getTitle();
	 String Expected_title="Login: Mercury Tours";
	 Assert.assertEquals(actual_title,Expected_title,"Login Failed");
  }
  
  @BeforeTest
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	
  }


}
