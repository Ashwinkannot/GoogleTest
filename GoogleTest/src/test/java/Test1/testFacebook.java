package Test1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import POM.GoogleHomePO;
import POM.GoogleSearchResultPO;

public class testFacebook extends BaseTest{

	@Test
	public void FaceBookTest() throws Exception
	{
		try
		{
		driver.get("https://www.google.com/");
		
		GoogleHomePO PO=new GoogleHomePO(driver);
		PO.googlesearch().sendKeys("facebook"+Keys.ENTER);
		Thread.sleep(2000);
		GoogleSearchResultPO GSRPO=new GoogleSearchResultPO(driver);
		GSRPO.facebooklink().click();
		System.out.println(driver.getTitle());
		
		String eTitle="Facebook – log in or sign up";
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		Reporter.log("Test Passed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Exception generated",true);
			Assert.fail();
			
		}
		
		
		
		
	}
	
	
}
