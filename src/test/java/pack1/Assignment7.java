/*Launch the browser and up the url(https://www.toolsga.com/automation practice

form
https://selenium.obsqurazone.com/check-box-demo.php
Verify all the check boxes are selected or deselected by default
.
And select the option 'Selenium WebDriver'
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

public class Assignment7 {
	WebDriver driver;
  @Test
  public void f() {
	 WebElement checkbox1= driver.findElement(By.cssSelector("input[id='gridCheck']"));
Boolean box1=checkbox1.isSelected();
System.out.println(box1);
//List<WebElement> checkboxes=driver.findElements(By.cssSelector("label[class='form-check-label']"));
//List<WebElement> checkboxes=driver.findElements(By.class("form-check-label");
List<WebElement> checkboxes=driver.findElements(By.xpath("//label[@class='form-check-label']"));
Boolean box2=checkboxes.get(0).isSelected();
System.out.println(box2);
Boolean box3=checkboxes.get(1).isSelected();
System.out.println(box3);
Boolean box4=checkboxes.get(2).isSelected();
System.out.println(box4);
Boolean box5=checkboxes.get(3).isSelected();
System.out.println(box5);
checkboxes.get(2).click();
driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	  driver.manage().window().maximize();
  }

}
