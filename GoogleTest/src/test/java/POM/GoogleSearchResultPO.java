package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class GoogleSearchResultPO extends BasePage{

	public GoogleSearchResultPO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebooklink;
	public WebElement facebooklink()
	{
		return facebooklink;
	}
	
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instagramlink;
	public WebElement instagramlink()
	{
		return instagramlink;
	}
	
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitterlink;
	public WebElement twitterlink()
	{
		return twitterlink;
	}
	
	@FindBy(xpath="//a[text()='LinkedIn (@LinkedIn) · Twitter']")
	private WebElement linkedinlink;
	public WebElement linkedinlink()
	{
		return linkedinlink;
	}
	
	
	
	

}
