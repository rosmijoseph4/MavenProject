package pack1;

import org.testng.annotations.Test;

import package8.ExcelData;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class DataReadDataprovider {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void login(String uservalue, String passvalue) {
	  WebElement username=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	  username.sendKeys(uservalue);
	  WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	  password.sendKeys(passvalue);
	  WebElement btn2=driver.findElement(By.name("submit"));
	  btn2.click();
  }
//  @BeforeMethod
//  public void beforeMethod() {
//		driver.get("https://demo.guru99.com/test/newtours/");
//  }


  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data=ExcelData.getDataFromSheet("C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Dataproviderexcel.xlsx");
    return data;
  }
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

}
