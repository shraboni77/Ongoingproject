/*package Wp.EasyJobsProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Wp.EasyJobsProject.DTO.CandLoginDTO;
import Wp.EasyJobsProject.DataProvider.CandLoginDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

public class ApplyJobs {

	private WebDriver driver =null;

	@Test
	public void checkJobPostPage() throws InterruptedException
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		
		driver.get(UrlTextUtils.URL.Base_URL);
		Thread.sleep(3000);
		
		
		
	}
	
	@Test(dependsOnMethods = "checkJobPostPage", dataProvider= "clogindata", dataProviderClass = CandLoginDataProvider.class )
	
	public void ApplyJobs1(List<CandLoginDTO> logdata1) throws InterruptedException{
	for(CandLoginDTO clogin : logdata1)	{
		
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.user_name)).sendKeys(clogin.getUsername());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.password)).sendKeys(clogin.getPassword());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandLoginModule.signIN_BTN)).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.save)).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.coverletter)).sendKeys("fgdhseaafggrdswaeqawsd");
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.checkbox)).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.save)).click();	
		Thread.sleep(3000);
		
		//start quiz
		
		
		
		driver.findElement(By.xpath(XpathUtils.Apply.quizstart)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.skip)).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.checkbox)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.finished)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.resume)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.Apply.finish)).click();	
		Thread.sleep(3000);
	
		
	}
}

	
	
///
	public static void applyJobs(WebDriver driver) {

		try {
			driver.findElement(By.xpath(apply_jobs.apply_job_xpath)).click();
			Thread.sleep(1000);

			String MainWindow = driver.getWindowHandle();
			// To handle all new opened window.
			Set<String> handler = driver.getWindowHandles();
			Iterator<String> window = handler.iterator();
			while (window.hasNext()) {
				String ChildWindow = window.next();

				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
					// Switching to Child window
					driver.switchTo().window(ChildWindow);
					Login.loginForJobApply(driver);
					
					Thread.sleep(2000);
					//basic information page
//					driver.findElement(By.xpath(apply_jobs.click_on_no_employement_xpath)).click();
					driver.findElement(By.id(apply_jobs.expected_salary_id)).sendKeys(User_Input.expected_salary);
					driver.findElement(By.xpath(apply_jobs.save_and_continue_personal_info_page_xpath)).click();
					Thread.sleep(3000);
					
					//resume page
					driver.findElement(By.xpath(apply_jobs.cover_latter_xpath)).click();
					driver.findElement(By.xpath(apply_jobs.cover_latter_xpath)).clear();
					System.out.println("happens");
					driver.findElement(By.xpath(apply_jobs.cover_latter_xpath)).sendKeys(User_Input.cover_letter);
					System.out.println("happens 2");
					driver.findElement(By.xpath(apply_jobs.aggrement_xpath)).click();
					System.out.println("happens 3");
					driver.findElement(By.xpath(apply_jobs.save_and_continue_resume_page_xpath)).click();
					Thread.sleep(3000);
					
					//screening test page
					driver.findElement(By.id(apply_jobs.screening_question_1_id)).sendKeys(User_Input.screening_question_1_answer);
					driver.findElement(By.xpath(apply_jobs.screening_question_2_checkbox_xapth)).click();
					driver.findElement(By.xpath(apply_jobs.screening_page_save_continue_button_xpath)).click();
					Thread.sleep(3000);
					
					//quiz page
					driver.findElement(By.xpath(apply_jobs.start_quiz_button_xpath)).click();
					driver.findElement(By.xpath(Quiz_Exam.question_option_1_xpath)).click();
					driver.findElement(By.xpath(Quiz_Exam.question_1_save)).click();
					driver.findElement(By.xpath(Quiz_Exam.question_option_2_xpath)).click();
					driver.findElement(By.xpath(Quiz_Exam.question_2_save)).click();
					driver.findElement(By.xpath(Quiz_Exam.finish_quiz_button_xpath)).click();
					Thread.sleep(3000);
					
					//finish apply
					driver.findElement(By.xpath(apply_jobs.finish_apply_button_xpath)).click();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/