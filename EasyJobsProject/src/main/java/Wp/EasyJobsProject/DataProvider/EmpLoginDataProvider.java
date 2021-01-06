package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class EmpLoginDataProvider {
	
	@DataProvider(name="emplogdata")
	public static Object [][] getEmpLogData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getEmpLoginData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
	

}
