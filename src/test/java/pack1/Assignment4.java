/*Launch the browser and up the url(http://www.opesmount.in/grocerystore1/
• Verify the title of the page by Assertion(Hard Assert & Soft Assert)
Check whether the driver have null value or not
Close the browser
*/

package pack1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Assignment4 {
	WebDriver driver;
  @Test
  public void getTitle() {
	 String actual_title= driver.getTitle();
	 String Expcted_title="Grocerystore";
	Assert.assertEquals(actual_title, Expcted_title);
	 //SoftAssert sa=new SoftAssert();
	 //sa.assertEquals(actual_title, Expcted_title);
	 
		// SoftAssert sa=new SoftAssert();
	   // sa.assertNull(driver);
	Assert.assertNull(driver);
	 //driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  driver.manage().window().maximize();
	  
  }

}
