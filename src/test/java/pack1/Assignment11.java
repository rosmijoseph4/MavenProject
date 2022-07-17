/*Launch the browser and up the url(http://queryui.com/droppable)

 * https://jqueryui.com/droppable/
 
Move the cursor to "Support' and click 'Learning Center' and click.
Then back to previous page
Perform Drag and Drop
*/
package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Assignment11 {
	WebDriver driver;
  @Test
  public void mouseHover() {
	WebElement support=driver.findElement(By.linkText("Support"));
	WebElement learning=driver.findElement(By.linkText("Learning Center"));
	Actions ac=new Actions(driver);
	ac.moveToElement(support).moveToElement(learning).click().perform();

	//ac.moveToElement(support).perform();
	//driver.navigate().back();
	}
  /*
  @Test
  public void dragDrop() {
	  WebElement frame=  driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 driver.switchTo().frame(frame);
			WebElement drag= driver.findElement(By.id("draggable"));
			WebElement drop= driver.findElement(By.id("droppable"));
			Actions ac=new Actions(driver);
			ac.dragAndDrop(drag, drop).perform();  
  }
  */
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }
  

}
