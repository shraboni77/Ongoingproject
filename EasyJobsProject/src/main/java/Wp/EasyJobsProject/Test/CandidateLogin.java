package Wp.EasyJobsProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.DTO.CandLoginDTO;
import Wp.EasyJobsProject.DataProvider.CandLoginDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;


@Listeners(TestNGReporting.class)
public class CandidateLogin {

	
	private WebDriver driver =null;

	@Test
	public void checkLoginPageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.LoginPageTitle);
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods = "checkLoginPageTitle", dataProvider = "clogindata", dataProviderClass = CandLoginDataProvider.class )
	public void logintest(List<CandLoginDTO> clogdata) throws InterruptedException{
	for(CandLoginDTO clogin : clogdata)	{
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.user_name)).sendKeys(clogin.getUsername());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.password)).sendKeys(clogin.getPassword());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.signIN_BTN)).click();	
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
		
	}
		
}
}
