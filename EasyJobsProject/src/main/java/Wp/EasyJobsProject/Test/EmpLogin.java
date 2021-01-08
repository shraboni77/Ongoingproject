package Wp.EasyJobsProject.Test;

import org.testng.annotations.Test;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import Wp.EasyJobsProject.DTO.EmpLoginDTO;
import Wp.EasyJobsProject.DataProvider.EmpLoginDataProvider;
import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

@Listeners(TestNGReporting.class)
public class EmpLogin {
	
	private WebDriver driver =null;
	
	@Test
	public void checkLoginPageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Thread.sleep(9000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.LoginPageTitle);
	}
	
	@Test(dependsOnMethods = "checkLoginPageTitle", dataProvider = "emplogdata", dataProviderClass = EmpLoginDataProvider.class )
	public void elogintest(List<EmpLoginDTO> logdata) throws InterruptedException{
	for(EmpLoginDTO emplog : logdata)	{
		driver.findElement(By.xpath(XpathUtils.EmpLoginModule.user_name)).sendKeys(emplog.getUsername());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.EmpLoginModule.password)).sendKeys(emplog.getPassword());
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.EmpLoginModule.signIN_BTN)).click();	
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
		Thread.sleep(3000);
	}
	

}
}