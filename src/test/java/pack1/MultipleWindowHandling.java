package pack1;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MultipleWindowHandling {
	WebDriver driver;
  @Test
  public void handlingWindows() {
	  WebElement b1 = driver.findElement(By.xpath("//a[normalize-space(text())='Like us On Facebook']"));
		b1.click();
		
		String MainWindow=driver.getWindowHandle();	
     				
      Set<String> s1=driver.getWindowHandles(); 
      Iterator<String> itr=s1.iterator();		
      while(itr.hasNext())			
      {		
          String ChildWindow=itr.next();	
          		
          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
          {    		
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);
                  driver.manage().window().maximize();
					
					  driver.findElement(By.name("email")).sendKeys("rosmi@gmail.com");
					  driver.findElement(By.name("pass")).sendKeys("12345678");
					 driver.findElement(By.xpath("//span[text()='Log In']")).click();
					 	//driver.findElement(By.xpath	()//span[text()='Log In']	
          }		
      }		
      // Switching to Parent window i.e Main Window.
          driver.switchTo().window(MainWindow);
	}

  
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/window-popup.php");
	  driver.manage().window().maximize();
	//http://demo.guru99.com/test/upload/

  }

}
