
	 
	    	package pack1;

	    	import org.testng.annotations.Test;


	    	import java.awt.AWTException;
	    	import java.awt.Robot;
	    	import java.awt.event.KeyEvent;
	    	import java.util.Iterator;
	    	import java.util.Set;

	    	import org.openqa.selenium.WebDriver;
            import org.openqa.selenium.chrome.ChromeDriver;
            import org.openqa.selenium.edge.EdgeDriver;
	    	import org.testng.annotations.BeforeTest;

	    	public class MultiTabHandling{
	    		WebDriver driver;
	    	  @Test
	    	  public void f() throws AWTException, InterruptedException {
	    		  Robot r = new Robot();
	    		  r.keyPress(KeyEvent.VK_CONTROL);
	    		  r.keyPress(KeyEvent.VK_T);
	    		  
	    	      r.keyRelease(KeyEvent.VK_CONTROL);
	    	      r.keyRelease(KeyEvent.VK_T);
	    	      
	    	      
	    	      
	    	      
	    	      String parent = driver.getWindowHandle();
	    		  Set<String> s = driver.getWindowHandles();
	    	 	 Iterator<String> i = s.iterator();
	    		 while(i.hasNext()) {
	    			 String child = i.next();
	    			 if(!parent.equals(child)) {
	    				 Thread.sleep(3000);
	    				 driver.switchTo().window(child);
	    				 Thread.sleep(3000);
	    				 driver.get("https://selenium.obsqurazone.com/window-popup.php");
	    				 //System.out.println("haiiiiiiiiiii");
	    			 }
	    		 }

	    	}
	    	  @BeforeTest
	    	
	    	  public void beforeTest() {
	    		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\chromepath\\chromedriver.exe");
	    			driver=new ChromeDriver();
	    			driver.get("https://demo.guru99.com/test/newtours/");
	    			driver.manage().window().maximize();
	    	  }

	    	}

	    	  

	    
	  
  
	    
	    

	  	 
