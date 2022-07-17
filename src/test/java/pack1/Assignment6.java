/*
 
Launch the browser and up the url(http://demo.guru99.com/test/ajax.html)

• Verify all the radiobuttons are deselected by default
Click the radio button "No, it should be locate by "name"
Close the browser

 */

package pack1;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Assignment6 {
	WebDriver driver;
  @Test
  public void f() {
	// WebElement radio1= driver.findElement(By.id("yes"));
	List<WebElement> buttons= driver.findElements(By.name("name"));
	 Boolean button1=buttons.get(1).isSelected();
	 Boolean button2=buttons.get(0).isSelected();
	 System.out.println(button1);
	 System.out.println(button2);
	 buttons.get(1).click();
	 
	 
	 
	// Boolean buton1=radio1.isSelected();
	// Boolean buton2=radio2.isSelected();
	 //System.out.println(buton2);
	// radio2.click();
	// driver.close();
	 
	 
	 
	
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/ajax.html");
	  driver.manage().window().maximize();
  }

}
