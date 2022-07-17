package package8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement text_field1 = driver.findElement(By.id("single-input-field"));
		text_field1.sendKeys("My name is Rosmi");
		//text_field1.clear();
		WebElement btn_1=driver.findElement(By.id("button-one"));
		//btn_1.submit();
		btn_1.click();
		//WebElement btn_2=driver.findElement(By.partialLinkText("show mes"));
		
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
				
				
				
			WebElement link_1=	driver.findElement(By.linkText("Checkbox Demo"));
			link_1.click();
			WebElement check_box1=driver.findElement(By.id("gridCheck"));
			check_box1.click();
			List<WebElement> check_box2=driver.findElements(By.className("check-box-list"));
			
			check_box2.get(0).isDisplayed();
			check_box2.get(0).click();
			Boolean c0=check_box2.get(0).isEnabled();
			System.out.println(c0);
			check_box2.get(1).isDisplayed();
			check_box2.get(1).click();
			Boolean c1=check_box2.get(0).isEnabled();
			System.out.println(c1);
			check_box2.get(2).isDisplayed();
			check_box2.get(2).click();
			Boolean c2=check_box2.get(0).isEnabled();
			System.out.println(c2);
			Boolean s=check_box2.get(2).isSelected();
			System.out.println(c2);
			check_box2.get(3).isDisplayed();
			check_box2.get(3).click();
			Boolean c3=check_box2.get(0).isEnabled();
			System.out.println(c3);
			/*
			
			WebElement button1=driver.findElement(By.id("button-two"));
			button1.click();
			
			*/
			
			
			WebElement link_2=driver.findElement(By.linkText("Radio Buttons Demo"));
			link_2.click();
			
	List<WebElement> radio_btn1=driver.findElements(By.className("form-check-input"));
	radio_btn1.get(1).isDisplayed();
	radio_btn1.get(1).click();
	WebElement btn1=driver.findElement(By.id("button-one"));
	btn1.click();
	List<WebElement> radio_btn2=driver.findElements(By.name("student-gender"));
	radio_btn2.get(1).isDisplayed();
	radio_btn2.get(1).click();
	
	List<WebElement> radio_btn3=driver.findElements(By.name("student-age"));
	radio_btn3.get(2).isDisplayed();
	radio_btn3.get(2).click();
	WebElement btn5=driver.findElement(By.id("button-two"));
	btn5.click();
	String btn_text1=btn5.getText();
	System.out.println(btn_text1);
	Boolean select=radio_btn3.get(1).isSelected();
	System.out.println(select);
	
	
	
	
	
			
			/*
		WebElement Radio_btn=driver.findElement(By.id("inlineRadio2"));
		Radio_btn.click();
		WebElement btn1=driver.findElement(By.id("button-one"));
		btn1.click();
	WebElement btn2=driver.findElement(By.id("inlineRadio21"));
	btn2.click();
	WebElement btn3=driver.findElement(By.id("inlineRadio24"));
	btn3.click();
	WebElement btn4=driver.findElement(By.id("inlineRadio23"));
	Boolean b=btn4.isSelected();
	System.out.println(b);
			
	WebElement btn5=driver.findElement(By.id("button-two"));
	btn5.click();
	
	*/
	}

}
