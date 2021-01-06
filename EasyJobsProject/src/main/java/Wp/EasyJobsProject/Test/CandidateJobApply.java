package Wp.EasyJobsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

@Listeners(TestNGReporting.class)
public class CandidateJobApply {

	private WebDriver driver =null;

	@Test
	public void login() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		driver.get(UrlTextUtils.URL.Base_URL1);
		Thread.sleep(9000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.user_name)).sendKeys("shraboni+ejob090@ar.com.bd");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.password)).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.signIN_BTN)).click();	
		Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.candidatepage)).click();
		//Thread.sleep(3000);
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
