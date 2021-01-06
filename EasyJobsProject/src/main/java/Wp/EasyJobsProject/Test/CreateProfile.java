package Wp.EasyJobsProject.Test;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import Wp.EasyJobsProject.DTO.CreateProfileDTO;
//import Wp.EasyJobsProject.DataProvider.CreateProfileDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

public class CreateProfile {
	
	private WebDriver driver =null;
	
	@Test
	public void createprofile() throws InterruptedException {
	driver = DriverManager.driver;
	
	driver.findElement(By.xpath(XpathUtils.CandProfile.profile)).click();
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.createprofile);


	}
	
		@Test
		public void candidateprofilecreate() throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.CandProfile.cangeproinfobutton)).click();
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath(XpathUtils.CandProfile.gender)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandProfile.sgender)).click();
		
		
		driver.findElement(By.xpath(XpathUtils.CandProfile.dob)).click();
		driver.findElement(By.xpath(XpathUtils.CandProfile.dobdate)).click();
	
		Thread.sleep(3000);
		
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(XpathUtils.CandProfile.updatepro)).click();
		
		
		
	}
	
	
	}

	
	
	
