package package8;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CssSelectorDemo {
	WebDriver driver;
  @Test
  public void f() {
	//input.form-control
	  //WebElement Text_field12=driver.findElement(By.cssSelector("input.form-control"));
	  WebElement Text_field12=driver.findElement(By.cssSelector("input[class='form-control']"));
	  
		Text_field12.click();
		Text_field12.sendKeys("test1");
		//WebElement btn2=driver.findElement(By.cssSelector("button#button-one"));
		//WebElement btn2=driver.findElement(By.cssSelector("button[id='button-one']"));
		//WebElement btn2=driver.findElement(By.cssSelector("button[id^=butt]"));
		WebElement btn2=driver.findElement(By.cssSelector("button[id$='ne']"));
		//WebElement btn2=driver.findElement(By.cssSelector("button[id*=on]"));
		
		btn2.click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		

  }

}
