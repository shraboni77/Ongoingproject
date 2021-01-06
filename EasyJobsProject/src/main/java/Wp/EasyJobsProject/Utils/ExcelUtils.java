package Wp.EasyJobsProject.Utils;
    import java.io.File;


	import java.io.FileInputStream;
	import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;

	

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Wp.EasyJobsProject.DTO.CandLoginDTO;
import Wp.EasyJobsProject.DTO.CandRegDTO;
import Wp.EasyJobsProject.DTO.CreateJobDTO;
import Wp.EasyJobsProject.DTO.CreateProfileDTO;
import Wp.EasyJobsProject.DTO.EmpLoginDTO;
import Wp.EasyJobsProject.DTO.EmpRegDTO;

	

	public class ExcelUtils {

		private static FileInputStream inputStream = null;
		private static Workbook workbook= null;
		
		private static Sheet getSheet(int sheetNo) throws IOException
		{   
			//File file = new File("");
				
			File f= new File("src/main/java");
			File fs= new File(f,"data.xlsx");
			inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
			workbook = new XSSFWorkbook(inputStream);
			Sheet sheet=workbook.getSheetAt(sheetNo);
			return sheet;
		}
		
		//CandRegTest
		public static List<CandRegDTO> getRegData() throws IOException
		{
		List<CandRegDTO> regdata = new ArrayList<CandRegDTO>();
		DataFormatter formatter = new DataFormatter();
		//reg
		Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();
		
		while(rowiterator.hasNext())
		{
			Row newxtrow = rowiterator.next();
			Iterator<Cell> celliterator = newxtrow.cellIterator();
			
			
			CandRegDTO reg =new CandRegDTO();
			byte cellCounter =0;
			while(celliterator.hasNext())	
			{ 
				Cell cell = celliterator.next();
				
				switch(cellCounter){
					
				case 0:
					reg.setFirstname(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					reg.setLastname(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					reg.setEmail(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					reg.setPassword(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					reg.setConfrimpass(formatter.formatCellValue(cell));
					break;
					
				}
			}
			regdata.add(reg);
			
		}
		
		return regdata;
		}
		
		//candidatelogin
			public static List<CandLoginDTO> getCLoginData() throws IOException
			{
			List<CandLoginDTO> clogindata = new ArrayList<CandLoginDTO>();
			DataFormatter formatter = new DataFormatter();
		
			Iterator<Row> rowiterator = ExcelUtils.getSheet(1).iterator();
			
			while(rowiterator.hasNext())
			{
				Row newxtrow = rowiterator.next();
				Iterator<Cell> celliterator = newxtrow.cellIterator();
				CandLoginDTO clogin =new CandLoginDTO();
				byte cellCounter =0;
				while(celliterator.hasNext())	
				{ 
					Cell cell = celliterator.next();
					
					switch(cellCounter){
						
					case 0:
					clogin.setUsername(formatter.formatCellValue(cell));
					
						cellCounter++;
						break;
					case 1:
						clogin.setPassword(formatter.formatCellValue(cell));
					
							break;
				}
					
				}
					clogindata.add(clogin);
														
}
			return clogindata;
			
			
}
			
			
	//empreg
	/*public static List<EmpRegDTO> getERegData() throws IOException {
	
	List<EmpRegDTO> eregdata = new ArrayList<EmpRegDTO>();
	DataFormatter formatter = new DataFormatter();

	Iterator<Row> rowiterator = ExcelUtils.getSheet(2).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
		EmpRegDTO empreg =new EmpRegDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
									
					
					
		case 0:
			empreg.setPassword(formatter.formatCellValue(cell));
			cellCounter++;
				break;
			
			case 1:
				empreg.setConfrimpass(formatter.formatCellValue(cell));
					break;
			/*case 2:
				empreg.setEmail(formatter.formatCellValue(cell));
				cellCounter++;
					break;
			case 3:
				empreg.setPassword(formatter.formatCellValue(cell));
				cellCounter++;
					break;
			
			case 4:
				empreg.setConfrimpass(formatter.formatCellValue(cell));
				cellCounter++;
					break;
			case 5:
				empreg.setCompname(formatter.formatCellValue(cell));
				cellCounter++;
					break;
			case 6:
				empreg.setCompusername(formatter.formatCellValue(cell));
				cellCounter++;
					break;
			case 7:
				empreg.setCompphone(formatter.formatCellValue(cell));

				break;
	
				
	
			}
		}
		eregdata.add(empreg);
	}
	return eregdata;

			
	}			
	*/		
	//emplogin
	
	public static List<EmpLoginDTO> getEmpLoginData() throws IOException
	{
	List<EmpLoginDTO> emplogdata = new ArrayList<EmpLoginDTO>();
	DataFormatter formatter = new DataFormatter();

	Iterator<Row> rowiterator = ExcelUtils.getSheet(3).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
		EmpLoginDTO emplog =new EmpLoginDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
				
			case 0:
				emplog.setUsername(formatter.formatCellValue(cell));
			
				cellCounter++;
				break;
			case 1:
				emplog.setPassword(formatter.formatCellValue(cell));
			
					break;
		}
			
		}
		emplogdata.add(emplog);
												
}
	return emplogdata;
	
	
}
	//
	
	public static List<CreateJobDTO> getCreateJobData() throws IOException
	{
	List<CreateJobDTO> createjobdata = new ArrayList<CreateJobDTO>();
	DataFormatter formatter = new DataFormatter();

	Iterator<Row> rowiterator = ExcelUtils.getSheet(4).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
       CreateJobDTO createjoblog =new CreateJobDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
				
			case 0:
				createjoblog.setJobtitle(formatter.formatCellValue(cell));
			
				cellCounter++;
				break;
			case 1:
				createjoblog.setJobdetails(formatter.formatCellValue(cell));
			
				cellCounter++;
				break;
			case 2:
				createjoblog.setResponsibilites(formatter.formatCellValue(cell));
			
				break;
			
			
		}
			
		}
		createjobdata.add(createjoblog);
												
}
	return createjobdata;
	
	
}					
	
	
	//createcandidateprofile
	
	public static List<CreateProfileDTO> getProfileData() throws IOException
	{
	List<CreateProfileDTO> profiledata = new ArrayList<CreateProfileDTO>();
	DataFormatter formatter = new DataFormatter();
	//reg
	Iterator<Row> rowiterator = ExcelUtils.getSheet(5).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
		
		
		CreateProfileDTO candprofile =new CreateProfileDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
				
			case 0:
				candprofile.setPhnnumber(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			
			case 1:
				candprofile.setNationalid(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			
			case 2:
				candprofile.setFacebookprofilelink(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
				candprofile.setLinkedinprofilelink(formatter.formatCellValue(cell));
				break;
				
				
				
			}
		}
		profiledata.add(candprofile);
		
	}
	
	return profiledata;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}