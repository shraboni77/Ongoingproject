package Wp.EasyJobsProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.DTO.CandRegDTO;

import Wp.EasyJobsProject.DataProvider.CandRegDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;
@Listeners(TestNGReporting.class)
public class CandidateReg {

	
	private WebDriver driver =null;

	@Test
	public void checkRegPageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.sign_up)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.RegPageTitle);
	}
	
	@Test(dependsOnMethods = "checkRegPageTitle", dataProvider = "regdata", dataProviderClass = CandRegDataProvider.class )
	public void CandidateRegtest(List<CandRegDTO> logdata) throws InterruptedException{
	for(CandRegDTO candreg : logdata)	{
		
		driver.findElement(By.xpath(XpathUtils.CandRegModule.first_name)).sendKeys(candreg.getFirstname());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.last_name)).sendKeys(candreg.getLastname());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.email)).sendKeys(candreg.getEmail());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.password)).sendKeys(candreg.getPassword());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.confirm_password)).sendKeys(candreg.getConfrimpass());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.signIN_BTN)).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.cont_cand)).click();	
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	
	
	}

}


	
	
	
	
	
	
	
	
	

