package Automation.FrameWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverApi 
{
	public static WebDriver driver;
	String url="https://www.redbus.in/";
	int timeout=40;
	static int count=1;
	public void initBrowser()
	{
		//System.setProperty("webdriver.gecko.driver", "/home/vipin/workspace/geckodriver");
		driver= new FirefoxDriver();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	public WebDriver getDriver(WebDriver driver)
	{
		return this.driver;
	}
	
	public void getSnapshot(String filename) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("test"+filename+count+".png"));
		count++;
	}
	
	public void close()
	{
		driver.close();
	}
	
	public void quit()
	{
		driver.quit();
	}

}
