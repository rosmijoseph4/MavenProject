package package8;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		WebElement text_field1 = driver.findElement(By.name("email"));
		text_field1.sendKeys("test@gmail.com");
		WebElement text_field2 = driver.findElement(By.name("pass"));
		text_field2.sendKeys("rosmi");
		
		
		//text_field1.clear();
	WebElement btn_1=driver.findElement(By.linkText("Forgotten password?"));
		
		btn_1.submit();
		//WebElement btn_2=driver.findElement(By.partialLinkText("password"));
				//btn_2.click();
				
		String btn_tagname=btn_1.getTagName();
		System.out.println(btn_tagname);
		
		String btn_attr=btn_1.getAttribute("id");
		System.out.println(btn_attr);
		
		String btn_text=btn_1.getText();
		System.out.println(btn_text);
		
		Dimension btn_sz=btn_1.getSize();
		System.out.println(btn_sz.height);
		System.out.println(btn_sz.width);
		
		Point p=btn_1.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		String css_value=btn_1.getCssValue("font-family");
		System.out.println(css_value);
		
		
		
		
		
		
		
	

}
}
