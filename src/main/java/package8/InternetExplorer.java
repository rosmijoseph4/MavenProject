package package8;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\IEpath\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		//browser commands
				driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.get("https://groceryapp.uniqassosiates.com/home");
				//driver.get("https://google.com");
	}

}
