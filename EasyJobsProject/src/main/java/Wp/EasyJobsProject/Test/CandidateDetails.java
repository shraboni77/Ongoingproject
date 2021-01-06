package Wp.EasyJobsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.UserInputUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

@Listeners(TestNGReporting.class)
public class CandidateDetails {
	
	
	private WebDriver driver =null;

	@Test
	public void details() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		
	}	

	
	@Test(dependsOnMethods = "details")
	public void CheckCandidatepageTitle() throws InterruptedException
	
	
	{
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.candidatepage)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.candidatedetailspagetitle);
		Thread.sleep(3000);
		
}
	
	@Test(dependsOnMethods = "CheckCandidatepageTitle")
	public void CheckCandidateStatus() throws InterruptedException{
	
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.searchfield)).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selectjob)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.searchbyjob)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selectrating)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.ratings)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selectstatus)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.applied)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selectstatus)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.deselect)).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selected)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.reset)).click();
		Thread.sleep(3000);	
	
	
}
	
	@Test(dependsOnMethods = "CheckCandidateStatus")
	public void ViewCandidateDetails () throws InterruptedException{
		
		
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.viewdetails)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.applicantdetails);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.viewresume)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.viewevaluation)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.viewscreeningques)).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.vieweassessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.vieweattachment)).click();
		Thread.sleep(3000);
		
		
		//
		
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.conversation)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.conversationarea)).sendKeys("hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.conversationsend)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.rating)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.resetrating)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.confirm)).click();
		Thread.sleep(3000);
		
		//
		
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.note)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.note)).sendKeys("this one is good candidate");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.selecttag)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.tagmanager)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.save)).click();
		Thread.sleep(3000);
	
}
	@Test (dependsOnMethods = "ViewCandidateDetails")
	public void AssignAssessment() throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.assignbutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.selectassessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.assignment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.epirydate)).sendKeys("12/31/2020");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.assignassessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.editassessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.epirydate2)).sendKeys("01/01/2022");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.update)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.AssignAssessment.viewdetails)).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.deleteassessment)).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath(XpathUtils.AssignAssessment.confirm)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandidateDetailspage.back)).click();
		Thread.sleep(3000);
		
		
	}
		
	
}
