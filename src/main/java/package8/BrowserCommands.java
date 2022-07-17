package package8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();//For maximizing window,not a browser command
		String title=driver.getTitle();
		System.out.println(title);
		String current_url=driver.getCurrentUrl();
		System.out.println(current_url);
		String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		//driver.close();
		//driver.quit();
		
	}

}
