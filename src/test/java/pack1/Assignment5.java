
/*
 Launch the browser and up the url(

Guru99
https://demo.guru99.com/test/newtours/register.php
Fill this form by using locators(id, name, link l'ext, partialLinkText)
Perform actions on Wehrlemens by using Wellement.

commands(sendKeys.click.clear.isSelected, isEnabled etc)
Close the browser


 */
package pack1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Assignment5 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement first_name=driver.findElement(By.name("firstName"));
	  first_name.sendKeys("Rosmi");
	 WebElement last_name= driver.findElement(By.xpath("//input[@name='lastName']"));
	 last_name.sendKeys("Joseph");
	 WebElement phone= driver.findElement(By.cssSelector( "input[name='phone']"));
	 phone.sendKeys("1234567");
	 WebElement email=driver.findElement(By.id("userName"));
	 email.sendKeys("test1@gmail.com");
	 WebElement address=driver.findElement(By.cssSelector("input[name='address1']"));
	 address.sendKeys("UAE");
	 WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
	 city.sendKeys("Abudhabi");
	 WebElement postalcode=driver.findElement(By.cssSelector(" input[name='postalCode']"));
	 postalcode.sendKeys("123");
	 WebElement state=driver.findElement(By.name("state"));
	 state.sendKeys("Abudhabi");
	 WebElement dropdown=driver.findElement(By.name("country"));
	 Select s=new Select(dropdown);
	 s.selectByIndex(2);
	 Boolean drop=dropdown.isSelected();
	 System.out.println(drop);
	 
	 WebElement username=driver.findElement(By.name("email"));
	 username.sendKeys("rosmi");
	 Boolean name1=username.isEnabled();
	 System.out.println(name1);
	 WebElement password=driver.findElement(By.name("password"));
	 password.sendKeys("678");
	 WebElement confirmpassword=driver.findElement(By.name("confirmPassword"));
	 confirmpassword.sendKeys("678");
	// confirmpassword.clear();
	 WebElement submit=driver.findElement(By.name("submit"));
	 submit.click();
	 driver.close();
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
  }

}
