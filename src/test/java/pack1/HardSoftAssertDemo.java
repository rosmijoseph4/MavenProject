
/*Launch the browser and up the url(http://www.opesmommt.in/grocerystore/


Verify the title of the page by Assertion(Hard Assert & Soft Assert)

Check whether the driver have null value or not

Close the browser Launch the browser and up the url (hups://www.toolsga.com/automation-practice
*/
package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class HardSoftAssertDemo {
	WebDriver driver;
  @Test(priority=0)
  public void titleAssert() {
	  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  driver.manage().window().maximize();
	  String actual_title=driver.getTitle();
	  String expected_title="Obsqura Testing";
	  Assert.assertEquals(actual_title, expected_title);
	  driver.close();
	  
  }
  @Test(priority=1)
  public void relaunchBrowser() {
	  driver.get("https://www.toolsqa.com/automation practice form/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  
  }
  }


