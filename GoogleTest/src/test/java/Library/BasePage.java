package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,20);
		
	}
	
	public void VerifyTitle(String title)
	{
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title not diplayed",true);
			
		}
		
	}
	
	public void VerifyElement(WebElement ele)
	{
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element Present", true);
		}
		catch(Exception e)
		{
			Reporter.log("Element not present",true);
		}
		
		
	}


}
