package package8;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TableDemo {
	WebDriver driver;
  @Test
  public void tableDemoMethod() {
	 List<WebElement> row= driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr"));
	 // driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr"));
	int r_size= row.size();
	for(int i=0;i<r_size;i++)
	{
		List<WebElement> column=row.get(i).findElements(By.tagName("td"));
		for(int j=0;j<column.size();j++) {
			String value=column.get(j).getText();
			System.out.println(value);
		}
		
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	  driver.manage().window().maximize();
		
  }

}
