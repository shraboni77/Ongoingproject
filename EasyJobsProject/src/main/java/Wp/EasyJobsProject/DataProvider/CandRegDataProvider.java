package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class CandRegDataProvider {
	
	@DataProvider(name="regdata")
	public static Object [][] getCandRegData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getRegData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }

}
