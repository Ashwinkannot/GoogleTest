package Test1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import POM.GoogleHomePO;
import POM.GoogleSearchResultPO;

public class testLinkedin extends BaseTest {
	

	@Test
	public void TestLinkedin()
	{
		
		
		try 
		{
				driver.get("https://www.google.com/");
				GoogleHomePO PO=new GoogleHomePO(driver);
				PO.googlesearch().sendKeys("linkedin"+Keys.ENTER);
				GoogleSearchResultPO GSRPO= new GoogleSearchResultPO(driver);
				GSRPO.linkedinlink().click();
				System.out.println(driver.getTitle());
				
				String aTitle = "LinkedIn (@LinkedIn) | Twitter";
				String eTitle=driver.getTitle();
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
