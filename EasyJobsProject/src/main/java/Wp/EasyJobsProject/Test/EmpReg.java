package Wp.EasyJobsProject.Test;
import java.util.List;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Wp.EasyJobsProject.Utils.DriverManager;
import Wp.EasyJobsProject.Utils.TestNGReporting;
import Wp.EasyJobsProject.Utils.UrlTextUtils;
import Wp.EasyJobsProject.Utils.XpathUtils;

@Listeners(TestNGReporting.class)

public class EmpReg {

	private static  WebDriver driver =null;

	@Test
	public void checkLoginPageTitle() throws InterruptedException
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.CandRegModule.sign_up)).click();
		Thread.sleep(300);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.RegPageTitle);

	}

 @Test
 public static void test() throws InterruptedException {

//implement random data
Faker faker = new Faker();
String firstName = faker.name().firstName();
String lastName = faker.name().lastName();
String email = firstName.toLowerCase() + lastName.toLowerCase() +"@gmail.com";
String compName = faker.company().industry();
String compUsername = faker.name().firstName();
String phn = faker.phoneNumber().phoneNumber();

driver.findElement(By.xpath(XpathUtils.EmpRegModule.first_name)).sendKeys(firstName);
Thread.sleep(300);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.last_name)).sendKeys(lastName);
Thread.sleep(300);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.email)).sendKeys(email);
Thread.sleep(300);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.password)).sendKeys("12345678");
Thread.sleep(3000);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.confirm_password)).sendKeys("12345678");
Thread.sleep(3000);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.signup_BTN)).click();	
Thread.sleep(3000);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.continou)).click();	
Thread.sleep(3000);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.compname)).sendKeys(compName);
Thread.sleep(3000);
driver.findElement(By.xpath(XpathUtils.EmpRegModule.comp_uname)).sendKeys(compUsername);
Thread.sleep(3000);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.phn)).sendKeys(phn);
Thread.sleep(5000);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.sindustry)).click();
Thread.sleep(3000);	

driver.findElement(By.xpath(XpathUtils.EmpRegModule.industry)).click();
Thread.sleep(3000);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.website)).sendKeys("https://www.guru99.com/");
Thread.sleep(3000);	

driver.findElement(By.xpath(XpathUtils.EmpRegModule.checkbox)).click();
Thread.sleep(300);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.cont1)).click();	
Thread.sleep(3000);		
Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
Thread.sleep(3000);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.comname)).click();
Thread.sleep(300);	
driver.findElement(By.xpath(XpathUtils.EmpRegModule.logout)).click();
Thread.sleep(300);	

}


}



