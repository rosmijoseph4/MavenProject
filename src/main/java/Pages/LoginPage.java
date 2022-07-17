package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="userName")
	 private WebElement username; 
	 
	
	 
	 @FindBy(name="password") 
	 private WebElement password;
	 
	  @FindBy(name="submit") 
	  private WebElement submitbutton;
	 
	 // OR
	 
	// @FindBy(how=How.NAME,using="submit") 
	  //private WebElement submitbutton;
	 
	 public LoginPage(WebDriver driver) { 
		 this.driver = driver;
		 PageFactory.initElements(driver,this); 
		 }
	  
	  public void setLoginCredentials(String name,String pass) {
		 username.sendKeys(name);
		 password.sendKeys(pass); 
		 submitbutton.click(); 
		 }
}

	
	/*public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	

	public void setLoginCredentials(String uname, String pass) {
		
		// TODO Auto-generated method stub
		  WebElement username=driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		  username.sendKeys(uname);
		  WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		  password.sendKeys(pass);
		  WebElement btn2=driver.findElement(By.name("submit"));
		  btn2.click();
		
	}

}*/
