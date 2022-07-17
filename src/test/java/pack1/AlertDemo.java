package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertDemo {
	WebDriver driver;
  @Test(priority=1)
  public void alertWindow() {
	 WebElement simpl_alert_exp=driver.findElement(By.xpath("//button[text()=\"Click me!\"]"));
		simpl_alert_exp.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	
  }
  @Test(priority=2)
   public void confirmationWindow() {
			
	 WebElement confirm_alert_exp=driver.findElement(By.xpath("//button[text()='Click me!']/following::button"));	
	  //WebElement confirm_alert_exp=driver.findElement(By.xpath("//button[@class=\"btn btn-warning]"));
	  confirm_alert_exp.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss();
	  
		}
  
  @Test(priority=3)
  public void promptWindow() {
	  WebElement prompt_alert_exp=driver.findElement(By.xpath("//button[text()='Click me!']/following::button[2]"));
	  prompt_alert_exp.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("rosmi");
		al.accept();
	  
  }	
  

  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  driver.manage().window().maximize();
	

  }

}
