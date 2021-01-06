package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;


import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class CandLoginDataProvider {
	
	@DataProvider(name="clogindata")
	public static Object [][] getCandLoginData(){
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
