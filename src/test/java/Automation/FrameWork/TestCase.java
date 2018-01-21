package Automation.FrameWork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase extends WebDriverApi
{

  WebDriverApi webdriver;
  LoginClass login;
  
  
  @BeforeClass
  public void StartBrowser() 
  {
	  webdriver=new WebDriverApi();
	  webdriver.initBrowser();
  }
  
  @Test
  public void test1()
  {
	  login=new LoginClass(driver);
	  login.filldetails();
  }
  
  @AfterClass
  public void QuitBrowser() 
  {
	  //webdriver.close();
  }
}
