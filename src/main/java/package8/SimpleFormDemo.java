package package8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement text_field1=driver.findElement(By.id("single-input-field"));
		text_field1.click();
		text_field1.sendKeys("My name is Rosmi");
		WebElement btn1=driver.findElement(By.id("button-one"));
		btn1.click();
		WebElement text_field2=driver.findElement(By.id("value-a"));
		text_field2.click();
		text_field2.sendKeys("6");
		WebElement text_field3=driver.findElement(By.id("value-b"));
		text_field3.click();
		text_field3.sendKeys("8");
		
		WebElement btn2=driver.findElement(By.id("button-two"));
		btn2.click();
		
	}

}
