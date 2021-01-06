package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class CreateProfileDataProvider {
	@DataProvider(name="profiledata")
	public static Object [][] getProfileData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getCLoginData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
}
