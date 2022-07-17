package package8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement Text_field12=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		Text_field12.click();
		Text_field12.sendKeys("test1");
		//WebElement Text_field13=driver.findElement(By.name("password"));
		WebElement Text_field13=driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
		Text_field13.click();
		Text_field13.sendKeys("pass123");
		WebElement btn2=driver.findElement(By.name("submit"));
		btn2.click();

	}

}
