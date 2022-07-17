package package8;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Edgepath\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//browser commands
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.get("https://google.com");
	}

}

	

