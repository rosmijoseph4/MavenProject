package package8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement Text_field12=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
		WebElement Text_field12=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Message') and @id='single-input-field']"));
		Text_field12.click();
		Text_field12.sendKeys("test1");
		WebElement btn2=driver.findElement(By.xpath("//button[text()='Show Message']"));
		btn2.click();
	}

}
