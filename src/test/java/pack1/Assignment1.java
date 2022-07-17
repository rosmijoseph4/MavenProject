

/*Launch the browser and up the url(http://www.opesmount.in/grocerystore 1)

Get the title of the page
Verify the tile and url of the application
Close the browser
*/
package pack1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Assignment1 {
	 WebDriver driver;
  @Test
  public void pageTitle() {
	 String actual_title=driver.getTitle() ;
	 //System.out.println(actual_title);
	 String expected_title="Grocerystore";
	 Assert.assertEquals(actual_title, expected_title);
	 System.out.println(actual_title);
  }
  @Test
  public void pageUrl() {
	  String actual_url=driver.getCurrentUrl();
	  String expected_url="http://www.opesmount.in/grocerystore1/";
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(actual_url, expected_url);
	  System.out.println(actual_url);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  //driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
