package package8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Firefoxpath\\geckodriver.exe");
		//lauching firefox driver in Selenium
		WebDriver driver=new FirefoxDriver();
		//browser commands
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.get("https://google.com");
	}
}


