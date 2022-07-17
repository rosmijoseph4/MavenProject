package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUpload {
	WebDriver driver;
  @Test
  public void fileUploadDemo() {
	 WebElement file_locate= driver.findElement(By.name("uploadfile_0"));
	 file_locate.sendKeys("C:\\Users\\Rosmi Joseph\\Documents\\JavaNotes\\MavenNotes.docx");
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/upload/");
	  driver.manage().window().maximize();
	
  }

}
