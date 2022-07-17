package Test;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.ExcelData;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class LoginTest extends Base {
	
  @Test(dataProvider = "dp")
  public void loginTest(String uname, String pass) {
	  LoginPage lp =new LoginPage(driver);
	  lp.setLoginCredentials(uname,pass);
	  driver.get("https://demo.guru99.com/test/newtours/");
  }

  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data=ExcelData.getDataFromSheet("C:\\Users\\Rosmi Joseph\\Documents\\Selenium\\Dataproviderexcel.xlsx");
	    return data;
  }
}
