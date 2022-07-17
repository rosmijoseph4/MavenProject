/*Taunch the browser and up the url(https://www.tools.com/automation-practice
form
Upload a file
Download file "Selenium Automation Hybrid Framework"
*/
package package8;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Assignment12 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement file_locate= driver.findElement(By.name("uploadfile_0"));
		 file_locate.sendKeys("C:\\Users\\Rosmi Joseph\\Documents\\JavaNotes\\MavenNotes.docx");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //driver.get("http://demo.guru99.com/test/yahoo.html");
	  driver.get("http://demo.guru99.com/test/upload/");
	  
	  driver.manage().window().maximize();
  }

}
