package Wp.EasyJobsProject.Test;

import java.util.List;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.DTO.CreateJobDTO;
import Wp.EasyJobsProject.DataProvider.CreateJobDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.LocatorUtils;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.UserInputUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;
import Wp.EasyJobsProject.Utils.XpathUtils.Custom_Job_Apply_Field;



@Listeners(TestNGReporting.class)
public class CreateJobs {

	private WebDriver driver =null;

	@Test
	public void createjobpageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(XpathUtils.Createjob.job)).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.publisedjob);
		Thread.sleep(3000);
		
}
	
	
	@Test(dependsOnMethods = "createjobpageTitle", dataProvider = "createjob", dataProviderClass = CreateJobDataProvider.class )
	public void createjob(List<CreateJobDTO> logdata3) throws InterruptedException{
	for(CreateJobDTO joblog : logdata3)	{
		
		driver.findElement(By.xpath(XpathUtils.Createjob.createjob)).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.createjob);
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.jobtitle)).sendKeys(joblog.getJobtitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.jobdetails)).sendKeys(joblog.getJobdetails());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.responsible)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.responsibilities)).sendKeys(joblog.getResponsibilites());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.scategory)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.category)).click();
		Thread.sleep(4000);	
	    driver.findElement(By.xpath(XpathUtils.Createjob.expiry_date_xpath)).sendKeys("12/01/2021");
		driver.findElement(By.xpath(XpathUtils.Createjob.sskills)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.skills)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.semptyp)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.emptype)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.salrytype)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.salarytype)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Createjob.savecon)).click();
		Thread.sleep(3000);
		//screeningQuestion
		driver.findElement(By.xpath("//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[3]/ul/li[1]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"appa\"]/div[1]/main/div/section/form/div[7]/div/button")).click();
		Thread.sleep(3000);
	
	
		
		//quizquestion
	
		driver.findElement(By.xpath(LocatorUtils.Choose_Existing_Quiz_Set.click_select_existng_QS_xpath)).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(LocatorUtils.Choose_Existing_Quiz_Set.quiz_set)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(LocatorUtils.Choose_Existing_Quiz_Set.exam_duration_id)).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath(LocatorUtils.Choose_Existing_Quiz_Set.marks_per_question_id)).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath(LocatorUtils.Choose_Existing_Quiz_Set.save_and_publish_xpath)).click();
		Thread.sleep(3000);
		//customize
		driver.findElement(By.xpath("//*[@id=\"custom-field\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
        //confirm 
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span")).click();
		Thread.sleep(3000);
		//close icon
		driver.findElement(By.xpath("//*[@id=\"share-modal\"]/div/div/div/button/span")).click();
		Thread.sleep(3000);
		
	}
	
	}
	
	}

