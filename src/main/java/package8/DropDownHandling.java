/**

 * 
 */
package package8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Rosmi Joseph
 *
 */
public class DropDownHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		/*
		
	WebElement drop_down1=driver.findElement(By.id("single-input-field"));
	Select s=new Select(drop_down1);
	//s.selectByIndex(2);
	//s.selectByValue("Red");
	s.selectByVisibleText("Yellow");
	
	List<WebElement> fromoptions =s.getOptions();
	int size=fromoptions.size();
	System.out.println("The size is :" +size);
	for(int i=0;i<size;i++)
	{
		String option_value=fromoptions.get(i).getText();
		System.out.println(option_value);
		
		
	}
	*/
		
		WebElement drop_down2=driver.findElement(By.id("multi-select-field"));
		Select s=new Select(drop_down2);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.deselectByIndex(0);
		s.deselectByValue("Red");
		s.deselectByVisibleText("Yellow");
		s.deselectAll();
		List<WebElement> fromoptions =s.getOptions();
		int size=fromoptions.size();
		System.out.println("The size is :" +size);
		for(int i=0;i<size;i++)
		{
			String option_value=fromoptions.get(i).getText();
			System.out.println(option_value);
			
			
		}
	List<WebElement> fromselected=s.getAllSelectedOptions();
	int size1=fromselected.size();
	System.out.println("The size is :" +size1);
	for(int i=0;i<size1;i++)
	{
		String option_value=fromselected.get(i).getText();
		System.out.println(option_value);
		
		
	}
	WebElement firstselect=s.getFirstSelectedOption();
	System.out.println(firstselect.getText());
	
	
		
	}

}
