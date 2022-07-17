package package8;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RobotClassdemo {
	WebDriver driver;
  @Test
  public void robotClass() throws AWTException, InterruptedException {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  
	 String parent= driver.getWindowHandle();
	Set<String> s= driver.getWindowHandles();
	Iterator<String> i = s.iterator();
	while(i.hasNext()) {
		String child=i.next();
		if(!parent.equals(child)) {
			Thread.sleep(3000);
			driver.switchTo().window(child);
			//Thread.sleep(3000);
			driver.get("https://selenium.obsqurazone.com/window-popup.php");
		}
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.get("http://demo.guru99.com/test/yahoo.html");
		 driver.manage().window().maximize();  
  }

}
