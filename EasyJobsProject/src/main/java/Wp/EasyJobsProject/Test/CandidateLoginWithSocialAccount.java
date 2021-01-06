package Wp.EasyJobsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

public class CandidateLoginWithSocialAccount {

	@Listeners(TestNGReporting.class)
	public class CandidateLogin {

		
		private WebDriver driver =null;

		@Test
		public void checkLoginPageTitle() throws InterruptedException
		{
			driver = DriverManager.driver;
			
			Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.jobpagetitle);
			Thread.sleep(5000);
		}
	
	@Test
	public void jobApply() throws InterruptedException {
		
		driver.findElement(By.xpath(XpathUtils.appliedjobs.jobapply)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(XpathUtils.appliedjobs.googleJob_button)).click();
		Thread.sleep(5000);
		//driver.findElement(by.xpathUtils.appliedjobs.).click();
		
		
		
		
	}
	
	
	
	
}
}
