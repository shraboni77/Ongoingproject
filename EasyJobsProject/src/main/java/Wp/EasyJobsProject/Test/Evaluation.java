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
public class Evaluation {

	private WebDriver driver =null;

	@Test
	public void evaluationtest() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		
	
	}
	
	@Test(dependsOnMethods = "evaluationtest")
	public void quiestionset() throws InterruptedException{
		
		//questioncreation
		driver.findElement(By.xpath(XpathUtils.Evaluation.evaluationtab)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.selectque)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.addnewques)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.questionname)).sendKeys("test purpose");
		//Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.selectquestype)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.screeningquestion)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(XpathUtils.Evaluation.addquestion)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.questype1)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.texttype)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.typeques)).sendKeys("new commer");
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.saveques)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.delteques)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.confirm)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.EmpLogoutModule.select)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.EmpLogoutModule.logout)).click();
		Thread.sleep(3000);
		//delete
	}
	
	
	
	/*
		@Test(dependsOnMethods = "quiestionset")
		public void assessment() throws InterruptedException{
		
		
		//assessment
		
		driver.findElement(By.xpath(XpathUtils.Evaluation.assessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.createassessment)).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.assessmentname)).sendKeys("Testing");
		Thread.sleep(300);
		driver.findElement(By.xpath(XpathUtils.Evaluation.existingassessment)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.requiredassessment)).click();
		Thread.sleep(3000);
		//duration
		driver.findElement(By.xpath(XpathUtils.Evaluation.assessmentduration)).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.marksperques)).sendKeys("3");
		Thread.sleep(3000);
		//save
		driver.findElement(By.xpath(XpathUtils.Evaluation.save1)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Evaluation.delete1)).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(XpathUtils.Evaluation.assessmentname)).sendKeys("thandar");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.assessmentduration)).sendKeys("3");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.marksperques)).sendKeys("3");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.addques)).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath(XpathUtils.Evaluation.typeques1)).sendKeys("why you are so serious");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.ansfield1)).sendKeys("silence");
		//driver.findElement(By.xpath(XpathUtils.Evaluation.anffield2)).sendKeys("thandar");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.selectcorrectans)).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(XpathUtils.Evaluation.save)).click();
		//Thread.sleep(3000);		
		
}
		
		
	*/	
		
	
	/*@Test(dependsOnMethods = "quiestionset")
	public void editevaluation() throws InterruptedException{
	
	driver.findElement(By.xpath(XpathUtils.Evaluation.edit)).click();
	driver.findElement(By.xpath(XpathUtils.Evaluation.addques3)).click();
	driver.findElement(By.xpath(XpathUtils.Evaluation.input)).sendKeys("Why are you looking at his door?");
	driver.findElement(By.xpath(XpathUtils.Evaluation.option1)).sendKeys("thandar");
	driver.findElement(By.xpath(XpathUtils.Evaluation.option2)).sendKeys("nothing");
	driver.findElement(By.xpath(XpathUtils.Evaluation.correct)).click();
	driver.findElement(By.xpath(XpathUtils.Evaluation.update)).sendKeys("thandar");
	driver.findElement(By.xpath(XpathUtils.Evaluation.back)).click();
	driver.findElement(By.xpath(XpathUtils.Evaluation.delete)).click();
	
	
	
	
	
	
	}	
	
	
	
	*/
	
	
	
	
}
