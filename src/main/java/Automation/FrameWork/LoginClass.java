package Automation.FrameWork;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass
{
	WebDriver driver;
	
	@FindBy(id="src")
	private WebElement srcstn;
	
	@FindBy(id="dest")
	private WebElement deststn;
	
	@FindBy(xpath="//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")
	private WebElement fromdateicon;
	
	@FindBy(id="rb-calendar_onward_cal")
	private WebElement fromcalandertable;
	
	@FindBy(xpath="//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td[2]")
	private WebElement frommonth;
	
	@FindBy(xpath="//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td[3]")
	private WebElement fromnext;
	
	@FindBy(xpath="//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[7]")
	private WebElement fromdate;
	
	@FindBy(xpath="//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")
	private WebElement todateicon;
	
	@FindBy(id="rb-calendar_return_cal")
	private WebElement tocalandertable;
	
	@FindBy(xpath="//*[@id='rb-calendar_return_cal']/table/tbody/tr/td[2]")
	private WebElement tomonth;
	
	@FindBy(xpath="//*[@id='rb-calendar_return_cal']/table/tbody/tr/td[3]")
	private WebElement tonext;
	
	@FindBy(xpath="//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[4]")
	private WebElement todate;
	
	//@FindBy(xpath="//*[contains(text(),'Search Buses')]")
	@FindBy(id="search_btn")
	private WebElement search;
	
	
	
    LoginClass(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
    public void filldetails()
    {
    	srcstn.sendKeys("Bangalore",Keys.DOWN);
    	deststn.sendKeys("Hyderabad",Keys.DOWN);
    	fromdateicon.click();
    	fromdate.click();
    	todateicon.click();
    	todate.click();
    	search.click();
    }

}
