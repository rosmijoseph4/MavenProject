package pack1;

import org.testng.annotations.Test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TableHandlingDemo {
	WebDriver driver;
  @Test
  public void tableHandling() {
	 // WebElement elmt= driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[2]/td[2]"));
	  WebElement elmt= driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[1]/td[3]"));
		String val = elmt.getText();
		System.out.println(val);
		
		List<WebElement> row_values = driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr"));
		
		int r_size = row_values.size();
		for(int i=0;i<r_size;i++) {
			List<WebElement> cell= row_values.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cell.size();j++) {
				String cell_val=cell.get(j).getText();
				System.out.println(cell_val); 
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
