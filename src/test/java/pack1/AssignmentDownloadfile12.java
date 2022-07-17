package pack1;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class AssignmentDownloadfile12 {
	WebDriver driver;
  @Test
  public void f() throws IOException {
		 WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		 //downloadButton.click();
		 String sourceLocation = downloadButton.getAttribute("href");
		 String wget_command = "cmd /c C:\\Users\\Rosmi Joseph\\Downloads\\wget.exe -P C:\\DOWNLOADS --no-check-certificate " + sourceLocation;
		 Runtime.getRuntime().exec(wget_command);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Edgepath\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		 driver.manage().window().maximize();
		
  }

}
