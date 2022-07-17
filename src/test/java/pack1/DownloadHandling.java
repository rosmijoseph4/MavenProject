package pack1;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class DownloadHandling {
	WebDriver driver;
  @Test
  public void downloadPgm() throws IOException {	 
		 WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		 //downloadButton.click();
		 String sourceLocation = downloadButton.getAttribute("href");
		 String wget_command = "cmd /c C:\\Wget\\wget.exe -P C: --no-check-certificate" + sourceLocation;
		 Runtime.getRuntime().exec(wget_command);
		 System.out.println("ggg");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 System.setProperty("webdriver.edge.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Edgepath\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		 driver.manage().window().maximize();
		
  }

}
