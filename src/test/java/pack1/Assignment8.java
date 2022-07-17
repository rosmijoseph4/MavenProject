/*Launch the browser and up the URL(https://www.toolsga.com/automation-practice

Form
https://selenium.obsqurazone.com/select-input.php
Select option Australia' from the dropdown(Continents)
Print the selected one

14nd the number of elements & print all the elements presented in the dropdown
*/
package pack1;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Assignment8 {
	WebDriver driver;

  @Test
  public void f() {
	  WebElement drop_down1=driver.findElement(By.id("single-input-field"));
		Select s=new Select(drop_down1);
		
		s.selectByVisibleText("Yellow");
		
		List<WebElement> fromoptions =s.getOptions();
		String option_value1=fromoptions.get(2).getText();
		System.out.println(option_value1);
		int size=fromoptions.size();
		System.out.println("The size is :" +size);
		
		String option_value2=fromoptions.get(1).getText();
		System.out.println(option_value2);
	
		String option_value3=fromoptions.get(3).getText();
		System.out.println(option_value3);
		/*
		int size=fromoptions.size();
		System.out.println("The size is :" +size);
		for(int i=0;i<size;i++)
		{
			String option_value=fromoptions.get(i).getText();
			System.out.println(option_value);
			
			
		}
		*/
  }
  @BeforeTest
  public void beforeTest() {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://selenium.obsqurazone.com/select-input.php");
		  driver.manage().window().maximize();
  }

}
