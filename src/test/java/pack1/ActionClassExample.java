package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class ActionClassExample {
	WebDriver driver;
  @Test(enabled=false)
  public void rightClick() {
	
	  WebElement elmnt=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	  Actions ac=new Actions(driver);
	  ac.contextClick(elmnt).perform();
	  
  }
  @Test(enabled=false)
  public void doubleClickPgn() {
	  WebElement elmnt1=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]")); 
	  Actions ac=new Actions(driver);
	  ac.doubleClick(elmnt1).perform();
  }
  @Test
  public void dragAndDop() {
	  WebElement fframe = driver.findElement(By.className("demo-frame"));
	//	WebDriverWait wait=new WebDriverWait(driver, 2);
	//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fframe));
		driver.switchTo().frame(fframe);
		
	

	  WebElement source=driver.findElement(By.id("draggable")); 
	  WebElement destination=driver.findElement(By.id("droppable"));  
	  Actions ac=new Actions(driver);
	  ac.dragAndDrop(source, destination).perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  //driver.get("https://demo.guru99.com/test/simple_context_menu.html\n");
		driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://demoqa.com/menu/");
	  driver.manage().window().maximize();
	  //https://selenium.obsqurazone.com/javascript-alert.php

	  
	  //http://demo.guru99.com/test/simple_context_menu.html-double click

		
  }

}
