/*package Wp.EasyJobsProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Wp.EasyJobsProject.Utils.ExcelUtils;

public class EmpRegDataProvider {
	
	
	@DataProvider(name="empregdata")
	public static Object [][] getEmpRegData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getERegData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }

}
*/