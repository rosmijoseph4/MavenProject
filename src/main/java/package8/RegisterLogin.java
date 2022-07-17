package package8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement link1=driver.findElement(By.linkText("REGISTER"));
		link1.click();
		
		WebElement Text_field1=driver.findElement(By.xpath("//input[@name='firstName']"));
		Text_field1.click();
		Text_field1.sendKeys("Testfirst");
		
		WebElement Text_field2=driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		Text_field2.click();
		Text_field2.sendKeys("Testlast");
		
		WebElement Text_field3=driver.findElement(By.xpath("//input[@name=\"phone\"]"));
		Text_field3.click();
		Text_field3.sendKeys("123456789");
	

		WebElement Text_field4=driver.findElement(By.xpath("	//input[@name=\"userName\"]"));
		Text_field4.click();
		Text_field4.sendKeys("test@gmail.com");
		
		WebElement Text_field5=driver.findElement(By.name("address1"));
		Text_field5.click();
		Text_field5.sendKeys("testaddress");
		
		WebElement Text_field6=driver.findElement(By.name("city"));
		Text_field6.click();
		Text_field6.sendKeys("testcity");
		
		WebElement Text_field7=driver.findElement(By.name("state"));
		Text_field7.click();
		Text_field7.sendKeys("teststate");
	
		WebElement Text_field8=driver.findElement(By.name("postalCode"));
		Text_field8.click();
		Text_field8.sendKeys("1234");
	WebElement ddown1=	driver.findElement(By.name("country"));
	Select s=new Select(ddown1);
	s.selectByVisibleText("INDIA");
		WebElement Text_field9= driver.findElement(By.id("email"));
	Text_field9.sendKeys("test1");
	
	WebElement Text_field10= driver.findElement(By.name("password"));
	Text_field10.sendKeys("pass123");
	
	WebElement Text_field11= driver.findElement(By.name("confirmPassword"));
	Text_field11.sendKeys("pass123");
	WebElement btn1=driver.findElement(By.name("submit"));
	
	btn1.click();
	 
	WebElement link2= driver.findElement(By.partialLinkText("sign"));

	//WebElement link2= driver.findElement(By.linkText("SIGN-OFF"));
	link2.click();
	
	//WebElement Text_field12=driver.findElement(By.name("userName"));
	WebElement Text_field12=driver.findElement(By.xpath("//input[@name='userName']"));
	Text_field12.click();
	Text_field12.sendKeys("test1");
	//WebElement Text_field13=driver.findElement(By.name("password"));
	WebElement Text_field13=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	Text_field13.click();
	Text_field13.sendKeys("pass123");
	WebElement btn2=driver.findElement(By.name("submit"));
	btn2.click();

	
	
	
		
		
		
		
	}

}
