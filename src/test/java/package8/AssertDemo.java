package package8;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class AssertDemo {
	WebDriver driver;
  @Test(description="Verify Login")
  public void logIn() {
	 WebElement user_name= driver.findElement(By.name("userName"));
	 user_name.sendKeys("test1");
	 WebElement pass_word= driver.findElement(By.name("password"));
	 pass_word.sendKeys("pass123");
	 WebElement button= driver.findElement(By.name("submit"));
	 button.click();
	String actual_url=driver.getCurrentUrl();
	String expected_url="https://demo.guru99.com/test/newtours/login_sucess.php";
	Assert.assertEquals(actual_url,expected_url);
  }
  @Test(description="Verify title")
  public void title() {
  String actual_title=driver.getTitle();
  String expected_title="Welcome: Mercury Tours";
  SoftAssert sa=new SoftAssert();
  sa.assertEquals(actual_title, expected_title);
  }
  @Test(description="Verify username display")
  public void username() {
	  WebElement user_name= driver.findElement(By.name("userName"));
	 Assert.assertTrue( user_name.isDisplayed());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

}
