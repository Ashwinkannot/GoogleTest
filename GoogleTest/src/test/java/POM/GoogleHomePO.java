package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class GoogleHomePO extends BasePage{

	public GoogleHomePO(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='btnK']")
	private WebElement googlehome;
	public WebElement googlehome()
	{
		return googlehome;
	}
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement googlesearch;
	public WebElement googlesearch()
	{
		return googlesearch;
	}
	
}
