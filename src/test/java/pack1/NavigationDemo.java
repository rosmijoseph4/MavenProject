
/*
 * Launch the browser and up the url ("https://selenium.obsqurazone.com/javascript-alert.php" 

 * Then navigate to the url (https://www.toolsqa.com/automation practice form/)

Then navigate back to obsqura Then navigate to automation practice form

Then refresh the page

 */
package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NavigationDemo {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.toolsqa.com/automation practice form/");
	  driver.manage().window().maximize();
	  driver.navigate().back();
	  driver.manage().window().maximize();
	 driver.navigate().forward();
	  driver.navigate().refresh();
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
