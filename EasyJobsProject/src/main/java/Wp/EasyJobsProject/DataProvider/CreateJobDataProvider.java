package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class CreateJobDataProvider {

	@DataProvider(name="createjob")
	public static Object [][] getCreateJob(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getCreateJobData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
	
}
