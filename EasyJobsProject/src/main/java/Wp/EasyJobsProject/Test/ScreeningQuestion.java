package Wp.EasyJobsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

public class ScreeningQuestion {

	private WebDriver driver =null;

	@Test
	public void createjobpageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		
		driver.findElement(By.xpath(XpathUtils.Createjob.job)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.publisedjob);

		
}
	
}
