package Wp.EasyJobsProject.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

public class ResumeUpload {

	
private WebDriver driver =null;
	
	@Test
	public void createprofile() throws InterruptedException {
	driver = DriverManager.driver;
	
	driver.findElement(By.xpath(XpathUtils.resume.resume)).click();
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.resume);
	Thread.sleep(3000);

	}
	
	@Test 
	public  void uploadresume() throws InterruptedException, IOException
	{
		// enter the file path onto the file-selection input field
		
		driver.findElement(By.xpath(XpathUtils.resume.uploadresume)).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Shraboni\\Desktop\\AutoIt\\Fileupload.exe" );
		Thread.sleep(3000);
			
		}
		
	

	@Test
	public void appliedjob() throws InterruptedException {
		
		driver.findElement(By.xpath(XpathUtils.appliedjobs.appliedjob)).click();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.appliedjobtitle);
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	
	@Test 
	public void unfinishedjob() throws InterruptedException
	{
	
	
	
		driver.findElement(By.xpath(XpathUtils.appliedjobs.appliedjob)).click();
		Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
