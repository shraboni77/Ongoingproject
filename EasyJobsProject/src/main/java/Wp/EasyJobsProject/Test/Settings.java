package Wp.EasyJobsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;
@Listeners(TestNGReporting.class)
public class Settings {

	private WebDriver driver =null;

	@Test
	public void companySettings() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);

		driver.findElement(By.xpath(XpathUtils.Settings.settingstab)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.companysettings);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(XpathUtils.EmpLoginModule.user_name)).sendKeys("shraboni+ejob090@ar.com.bd");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.EmpLoginModule.password)).sendKeys("12345678");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.EmpLoginModule.signIN_BTN)).click();	
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.candidatepage)).click();
		//Thread.sleep(3000);
		
	
	
}
	
	@Test(dependsOnMethods = "companySettings")
	public void setting() throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.Settings.companybenifits)).sendKeys("Lorem Ipsum is simply dummy text of the");
		driver.findElement(By.xpath(XpathUtils.Settings.saveandcont)).click();
		Thread.sleep(3000);
	
		
	}	
		
     @Test(dependsOnMethods = "setting")
	 public void manageuser() throws InterruptedException{
	
	    driver.findElement(By.xpath(XpathUtils.Settings.menue)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Settings.manageuser)).click();
		Thread.sleep(3000);
		

		
		driver.findElement(By.xpath(XpathUtils.Settings.addnewuser)).click();
		driver.findElement(By.xpath(XpathUtils.Settings.inputuseremail)).sendKeys("shraboni+012@ar.com.bd");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Settings.permission)).click();
		Select role= new Select(driver.findElement(By.xpath(XpathUtils.Settings.selecetrole)));
		role.selectByValue("3");
		driver.findElement(By.xpath(XpathUtils.Settings.save)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Settings.delet)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Settings.confrim1)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Settings.edituser)).click();
		//Thread.sleep(30);
		//driver.findElement(By.xpath(XpathUtils.Settings.deselect)).click();
		//driver.findElement(By.xpath(XpathUtils.Settings.update)).click();
		//driver.findElement(By.xpath(XpathUtils.Settings.deleteuser)).click();
		//driver.findElement(By.xpath(XpathUtils.Settings.confirmdlt)).click();
		
		
	}
	
	
	//@Test(dependsOnMethods = "manageuser")
	/*public void appkey() throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.Settings.menue)).click();
		Thread.sleep(30);
		driver.findElement(By.xpath(XpathUtils.Settings.appkey)).click();
	
		driver.findElement(By.xpath(XpathUtils.Settings.generateappkey)).click();
		
		driver.findElement(By.xpath(XpathUtils.Settings.enterkey)).sendKeys("12s");
		
		driver.findElement(By.xpath(XpathUtils.Settings.generate)).click();
	
		driver.findElement(By.xpath(XpathUtils.Settings.deletekey)).click();
		
		driver.findElement(By.xpath(XpathUtils.Settings.confrim1)).click();	
		
		
	}
	*/
	
	
	@Test(dependsOnMethods = "manageuser")
	public void pipelinesetup() throws InterruptedException{
	
		driver.findElement(By.xpath(XpathUtils.Settings.menue)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.pipelinesetup)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.addnewpipeline)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.pipelinename)).sendKeys("newone");
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.newsteptitle)).click();	
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.savepipeline)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.pipelineupdate)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.pipelinename1)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.saveupdate)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.pipelinedlt)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Settings.confirmdlt)).click();
		Thread.sleep(300);
	
	
}
	
	
}