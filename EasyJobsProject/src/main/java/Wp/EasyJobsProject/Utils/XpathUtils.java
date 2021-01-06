package Wp.EasyJobsProject.Utils;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class XpathUtils {
	
	
public static class CandRegModule{
	
	    public static final String sign_up="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[1]/a";
		public static final String first_name= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[1]/div/input";
		public static final String last_name= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[2]/div/input";
		public static final String email= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
		public static final String password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/input";
		public static final String confirm_password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[4]/input";
		public static final String signIN_BTN="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/button";
		public static final String cont_cand="//*[@id=\"appa\"]/div[1]/div[1]/button/div[2]";
	}
	
	
	
	
	
public static class EmpRegModule{
	
	public static final String sign_up="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[1]/a";
	public static final String first_name= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[1]/div/input";
	public static final String last_name="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[2]/div/input";
	public static final String email= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
	public static final String password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/input";
	public static final String confirm_password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[4]/input";
	public static final String signup_BTN="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/button";
	public static final String continou ="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[4]/button";
		
	public static final String compname="//*[@id=\"company-name\"]";
	public static final String comp_uname= "//*[@id=\"username\"]";
	public static final String phn="//*[@id=\"phone-no\"]";
	public static final String sindustry="//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[4]/div/div[1]";
	public static final String industry="//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[4]/div/div[3]/ul/li[52]/span/span";
	public static final String website ="//*[@id=\"website\"]";
	public static final String checkbox="//*[@id=\"appa\"]/div[1]/div[3]/div/form/label[1]/span";
	public static final String cont1="//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[7]/button";
	public static final String comname ="//*[@id=\"appa\"]/div[1]/main/header/div[2]/div[3]/button/h3";
	public static final String logout ="//*[@id=\"appa\"]/div[1]/main/header/div[2]/div[3]/div/ul/li[3]/a/p";
	}


	
	

	
public static class CandLoginModule{
		
		public static final String user_name= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/input";
		public static final String password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
		public static final String signIN_BTN="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/button";
	}
	
	
	
	
public static class EmpLoginModule{
	
	public static final String user_name= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/input";
	public static final String password= "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
	public static final String signIN_BTN="//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/button";

}



public static class EmpLogoutModule{
	
	public static final String select= "//*[@id=\"appa\"]/div[1]/main/header/div[2]/div[3]/button";
	public static final String logout= "//*[@id=\"appa\"]/div[1]/main/header/div[2]/div[3]/div/ul/li[3]/a/p";
	

}



public static class CandProfile{
	
	public static final String profile= "//*[@id=\"appa\"]/div[1]/section/div[2]/nav/ul/li[2]/a/div[2]";
	public static final String iframe = "//*[@id=\"app\"]/iframe";
	public static final String cangeproinfobutton = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/a";
	public static final String updatepro= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/button";
	public static final String educationalqulali="//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div[2]/ul/li[2]/a";
	public static final String addquali= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/button/span[2]";
	public static final String save= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/button/span[2]";
	public static final String leveledu="//*[@id=\"education_level\"]";
    public static final String inistitute="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/form/div[2]/div/div[2]/div/input";
    public static final String pyear="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/form/div[2]/div/div[3]/div/input";
    public static final String degree="//*[@id=\"education_degree\"]";
    public static final String phnnumber= "//*[@id=\"phone_number\"]";
    public static final String nationalid ="//*[@id=\"national_id\"]";
    public static final String nationality = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[5]/div/div[1]";
    public static final String snationality ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[5]/div/div[2]/span";
    public static final String gender = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[8]/div/div[1]" ;
    public static final String sgender = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[8]/div/div[2]/span" ;
    public static final String facebook = "//*[@id=\"social_link_2\"]";
    public static final String linkedin = "//*[@id=\"social_link_1\"]" ;
    public static final String dob = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[7]/div/div/input";
    public static final String dobdate = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div/div/div[7]/div/div/div/div[2]/div[2]/div/div[2]/div[25]/span/span";
    
	
}
public static class Apply{
	
	public static final String save= "//*[@id=\"applyWrapper\"]/div/section/div/div/div/button";
	public static final String coverletter="//*[@id=\"quill_editor\"]/div[1]";
	public static final String checkbox="//*[@id=\"applyWrapper\"]/section[2]/div[2]/div/div/div/div/div/div/div[2]/div/label/div";
	public static final String quizstart= "//*[@id=\"applyWrapper\"]/section/div[3]/div/button";
	public static final String skip= "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[3]/div/button[1]";
	public static final String finished= "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[2]/div/button";
	public static final String resume= "//*[@id=\"previewTab\"]/li[2]/a";
	public static final String finish="/html/body/div[1]/section/div[1]/div[3]/a";
	
}

public static class Createjob{
	
	public static final String job="//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[2]/a/div[2]";
	public static final String createjob="//*[@id=\"appa\"]/div[1]/main/div/section/form/a/span[2]";
	
	public static final String jobtitle="//*[@id=\"job-title\"]";
	public static final String jobdetails = "//*[@id=\"job-details\"]/div[2]/div[1]";
	public static final String responsible = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[2]/ul/li[2]/a";
	public static final String responsibilities = "//*[@id=\"job-responsibilities\"]/div[2]/div[1]";
	public static final String scategory="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[3]/div/div/div[1]";
	public static final String category="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[3]/div/div/div[3]/ul/li[5]/span/span";
	public static final String  sdate="";
	public static final String  date= "";
	public static final String  sskills="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[10]/div/div/div[1]";
	public static final String skills="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[10]/div/div/div[3]/ul/li[3]/span";
	public static final String  semptyp="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[1]/div/div/div[1]";
	public static final String emptype = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[1]/div/div/div[3]/ul/li[1]/span";
	public static final String  salrytype="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[3]/div/div/div[1]";
	public static final String salarytype ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[3]/div/div/div[3]/ul/li[1]/span";
	public static final String savecon="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[4]/button";
	public static final String expiry_date_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/input";

	public static final String pick_a_date_xpath = "//*[@id='appa']/div/main/div/section/div[2]/form/div/div[9]/div/div/div/ul/li/div/div/table/tbody/tr[2]/td[5]";
	public static final String press_ok_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[3]/div[2]";
	
	
}

public static class screening{

	public static final String addquestion ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/button/span[2]";
	public static final String questiontype="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/div[2]/div/div[1]/div/div/div[1]";
	public static final String typeofquestion = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/div[2]/div[1]/div[1]/div/div/div[3]/ul/li[1]/span";
	public static final String question="//*[@id=\"question-0\"]";
	public static final String save = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div";
	public static final String SelectAnExistingQuestionSet = "//*[@id='appa']/div/main/div/section/form/div[3]/div/div/div";
	public static final String SelectAnExistingQuestion = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[3]/ul/li[1]/span";
	public static final String question1 ="//*[@id=\"question-0\"]";
	public static final String quizduration ="//*[@id=\"exam_duration\"]";
	public static final String marks ="//*[@id=\"marks_per_question\"]";
	public static final String questionset ="//*[@id=\"question-0\"]";
	public static final String answer ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[5]/div[2]/div[2]/div[2]/div/div/label/span";
	public static final String save3 ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[7]/button";
	public static final String customize="//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[1]/div/div[1]/label/span";
	public static final String save4="//*[@id=\"custom-field\"]/div/div/form/div[3]/button[2]";
	public static final String save_and_continue_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[6]/div/button";
	

}

public static class QuizTest{
	
public static final String existenceset= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[1]"	;
public static final String selectset= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[3]/ul/li[1]/span"	;
public static final String duration= "//*[@id=\"exam_duration\"]";
public static final String marks= "//*[@id=\"marks_per_question\"]";	
public static final String savecon1 ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[7]/button"	;
public static final String duration1 ="6";
public static final String marks1 ="6";
	
}

public static class datepicker{

	public static final String fromdate ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[2]/div/div[2]/div[8]/span/span";
	public static final String fromdatemonth = "/html/body/div[1]/div/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[2]/div/div[2]/div[15]/span/span";
	public static final String fromyear = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[2]/div";
    public static final String button ="/html/body/div[1]/div/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[3]/div[2]";
    public static final String dateclass1= "/html/body/div[1]/div/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[1]";

}

public static class customizefield {

	public static final String save = "//*[@id=\"custom-field\"]/div/div/div[3]/button[2]";
	public static final String others ="//*[@id=\"custom-field\"]/div/div/div[2]/div[2]/div[4]/div/div[1]/label/span";
	public static final String educational ="//*[@id=\"custom-field\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/label/span"; 
	public static final String facebook ="//*[@id=\"custom-field\"]/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[3]/label/span";
	public static final String linkedin ="//*[@id=\"custom-field\"]/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[2]/label/span";
	public static final String yes ="//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]";
	public static final String close = "//*[@id=\"share-modal\"]/div/div/div/button";
	public static final String back = "//*[@id=\"custom-field\"]/div/div/div[3]/button[1]";
	public static final String publish = "//*[@id=\"appa\"]/div[1]/main/div[2]/section/div/div[3]/button[2]";
	public static final String title= "//*[@id=\"custom-field\"]/div/div/div[1]/div/h4";
}

public static class Publish_job{
	
	public static final String publish_button_yes_xpath = "//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]";
	
	
	public static final String succecss_job_publised_xpath = "//*[@id=\"share-modal\"]/div/div/div/div/p";
	
	public static final String copy_job_post_url = "//*[@id=\"share-modal\"]/div/div/div/div/div[2]/button";
	
	public static final String close_window_for_job_published = "//*[@id=\"share-modal\"]/div/div/div/button/span";
}







    public static class Custom_Job_Apply_Field {
    	
	public static final String uncheck_basic_information_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[1]/div/div[1]/label/span";
	public static final String uncheck_education_qualification_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[2]/div/div[1]/label/span";
	public static final String uncheck_employment_history_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[3]/div/div[1]/label/span";
	public static final String uncheck_others_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[4]/div/div[1]/label/span";
	public static final String uncheck_documents_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[5]/div/div[1]/label/span";

	public static final String save_and_continue_AJAF_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[3]/button[2]";
}


public static class apply_jobs {
	
	public static final String apply_job_xpath = "/html/body/div/header/a";
	
	public static final String login_for_job_apply_email_id = "email";
	public static final String login_for_job_apply_password_id = "password";
	public static final String login_for_job_apply_signin_button_id = "login-submit";
	
	
	public static final String click_on_no_employement_xpath = "//*[@id=\"applyWrapper\"]/div/section[3]/div[1]/label/input";
//	public static final String year_of_passing_id = "passing_year_0";
	public static final String expected_salary_id = "expected_salary";
	
	public static final String save_and_continue_personal_info_page_xpath = "//*[@id=\"applyWrapper\"]/div/section[5]/div/div/div/button";
	
	public static final String cover_latter_xpath = "//*[@id=\"quill_editor\"]/div[1]";
	
	public static final String aggrement_xpath = "//*[@id=\"applyWrapper\"]/section[2]/div[2]/div/div/div/div/div/div/div[2]/div/label/div";
	
	public static final String save_and_continue_resume_page_xpath = "//*[@id=\"applyWrapper\"]/section[3]/div/div/div/button";
	
	public static final String screening_question_1_id = "question_0";
	
	public static final String screening_question_2_checkbox_xapth = "//*[@id=\"applyWrapper\"]/div/section[1]/div[2]/ul/li[2]/div[2]/div[1]/label";
	
	public static final String screening_page_save_continue_button_xpath = "//*[@id=\"applyWrapper\"]/div/section[2]/div/div/div/button";
	
	public static final String start_quiz_button_xpath = "//*[@id=\"applyWrapper\"]/section/div[3]/div/button";
	
	
	public static final String finish_apply_button_xpath = "/html/body/div[1]/section/div[1]/div[3]/a";
	
	public static final String congrats_message_xpath = "/html/body/div[1]/section/div[3]/h2";
	
	public static final String congrats_note_xpath = "/html/body/div[1]/section/div[3]/p";
	
	public static final String see_apply_job_button_xpath = "/html/body/div[1]/section/div[3]/a";
}


public static class resume {
	public static final String resume = "//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[3]/a/div[2]";
	public static final String uploadresume = "//*[@id=\"appa\"]/div[1]/main/div/section/div/div/label/span";
}


public static class appliedjobs {
	public static final String appliedjob="//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[4]/a/div[2]";
	public static final String jobapply ="/html/body/div/section[2]/div[2]/div/div/div/div[1]/div[3]/a";
	public static final String googleJob_button="/html/body/div[1]/section/div[2]/div/div/a[1]/p";
}


public static class CandidateDetailspage {
	public static final String candidatepage= "//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[3]/a/div[2]";                      
	public static final String searchfield= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[1]/div/div/input ";
	public static final String selectjob= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[2]/div/div/div[1] ";
	public static final String searchbyjob="//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[2]/div/div/div[3]/ul/li[1]/span/span";
	public static final String selectrating= " //*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[3]/div/div/div[1]";
	public static final String ratings= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[3]/div/div/div[3]/ul/li[1]/span";
	public static final String reset= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[5]/div/button ";
	public static final String selectstatus= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[4]/div/div/div[1] ";
	public static final String applied="//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[4]/div/div/div[3]/ul/li[2]/span";
	public static final String deselect ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[4]/div/div/div[3]/ul/li[2]/span"	;                 
	public static final String selected="//*[@id=\"appa\"]/div[1]/main/div/section/form/div/div[4]/div/div/div[3]/ul/li[3]/span/span";
	
	
	public static final String viewdetails="//*[@id=\"appa\"]/div[1]/main/div/section/div/div/div[2]/div/a";
    public static final String viewresume ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[1]/a[2]/div[2]";
    public static final String viewevaluation="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[1]/a[3]/div[2]";
    public static final String viewscreeningques="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[2]/div/div[1]/a[2]";
    public static final String vieweassessment="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[2]/div[1]/div/a[1]";
    public static final String vieweattachment="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[2]/div[1]/div/a[2]";
    
  
    
    
    
    public static final String conversation="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[1]/a[4]/div[2]";
    public static final String conversationarea= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[2]/div[1]/div[2]/form/textarea";
    public static final String conversationsend= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div[2]/div[1]/div[2]/form/div[2]/button";
    public static final String attch= " public static final String conversationarea= \"";
    
    public static final String rating = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[2]/ul/li[6]/div[2]/div/div[5]";
    public static final String resetrating="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[1]/div[4]";
    public static final String confirm ="//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span";
    public static final String note="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div[2]/div[2]/textarea";
    public static final String selecttag ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]";
    public static final String tagmanager = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/ul/li[1]/span";
    			
    public static final String save = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div[2]/div[2]/div[3]/button[2]";
    public static final String back= "//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div/a/i";
}

public static class PipelineChange{
	 public static final String selectdrpdown ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[1]/div[3]/button";
	 public static final String applied = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[1]/div[3]/div/a[1]";
	 public static final String selected= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[1]/div[3]/div/a[4]";
	 public static final String rejected= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/div[1]/div[3]/div/a[5]";
}


public static class AssignAssessment{
	 public static final String assignbutton ="//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/button";
	 public static final String selectassessment ="//*[@id=\"custom-field\"]/div/div/form/div[2]/div[1]/div/div/div/div[1]";
	 public static final String assignment= "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[1]/div/div/div/div[3]/ul/li[1]/span";
	 public static final String epirydate= "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div/div/input";
	 public static final String assignassessment = "//*[@id=\"custom-field\"]/div/div/form/div[3]/button";
	 public static final String editassessment="//*[@id=\"assessment-108\"]/div[2]/a[1]/div";
	 public static final String epirydate2= "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div/div/input";
	 public static final String update= "//*[@id=\"custom-field\"]/div/div/form/div[3]/button";
	 //public static final String viewdetails ="//*[@id=\"assessment-230\"]/div[1]/div[1]/i";
	 
	 public static final String deleteassessment ="//*[@id=\"assessment-108\"]/div[2]/a[2]/div/i";
	 public static final String confirm ="//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span";
}


public static class Settings{
	
	 public static final String settingstab="//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[4]/a/div[2]";
	 public static final String companybenifits ="//*[@id=\"benefits\"]/div/div/div/div[2]/div[1]";
	 public static final String saveandcont = "//*[@id=\"company_setup\"]/form/div/div[5]/button";
	 public static final String manageuser= "//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div[2]/ul/li[3]/a";
	 public static final String addnewuser = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/button/span[2]";
	 public static final String inputuseremail ="//*[@id=\"new-user-modal\"]/div/div/div[2]/div[1]/div[1]/input";
	 public static final String permission= "//*[@id=\"new-user-modal\"]/div/div/div[2]/div[2]/div[2]/div[1]/label/span";
	 public static final String selecetrole = "//*[@id=\"new-user-modal\"]/div/div/div[2]/div[1]/div[2]/div[1]/select";
	 public static final String role = "//*[@id=\"new-user-modal\"]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]";
	 public static final String save= "//*[@id=\"new-user-modal\"]/div/div/div[3]/button";
	 public static final String delet= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[3]/div[4]/div/a[2]/div/i";
	 
	 public static final String edituser="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[4]/div[4]/div/a[1]/div/i";
	 public static final String deselect ="//*[@id=\"update-user-modal\"]/div/div/div[2]/div[2]/div[2]/div[2]/ul/li[5]/label/span";
	 public static final String update= "//*[@id=\"update-user-modal\"]/div/div/div[3]/button";
	 public static final String deleteuser="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[4]/div[4]/div/a[2]/div/i";
	 public static final String appkey="//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div[2]/ul/li[4]/a";
	 public static final String generateappkey="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/a/span[2]";
	 public static final String enterkey="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/a/span[2]";
	 public static final String generate ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/form/div/div[2]/button";
	 public static final String deletekey="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[2]/div[5]/a/div/i";
	 public static final String confrim1= "//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span";
	 
	 
	 public static final String pipelinesetup="//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div[2]/ul/li[6]/a";
	 public static final String addnewpipeline="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[1]/a/span[2]";
	 public static final String pipelinename="//*[@id=\"new-pipeline-template\"]/div/div/div[2]/div[1]/input";
	 public static final String newsteptitle ="//*[@id=\"new-pipeline-template\"]/div/div/div[2]/div[3]/div[2]/input";
	 public static final String savepipeline ="//*[@id=\"new-pipeline-template\"]/div/div/div[3]/button[2]";
	 public static final String pipelineupdate = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[2]/div[4]/div/a[1]";
	 public static final String pipelinename1 = "//*[@id=\"new-pipeline-template\"]/div/div/div[2]/div[1]/input";
	 public static final String pipelinedlt = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/div[2]/div[4]/div/a[2]/span";
	 public static final String confirmdlt="//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span";
	 public static final String saveupdate="//*[@id=\"new-pipeline-template\"]/div/div/div[3]/button[2]";
	public static final String menue= "//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/div[1]";
}

public static class Evaluation{
	//questioncreation
	public static final String evaluationtab="//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[5]/a/div[2]";
	public static final String selectque ="//*[@id=\"JobInfo\"]/li[1]/a";
	public static final String addnewques="//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/a/span[2]";
	
	public static final String questionname = "//*[@id=\"set_name\"]";
	public static final String selectquestype = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[1]/div/div[2]/div/div[1]";
	public static final String screeningquestion= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[1]/div/div[2]/div/div[3]/ul/li[1]/span";
	
	public static final String addquestion = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/button/span[2]";
	public static final String questype1 = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/div[2]/div/div[1]/div/div/div[1]";
	public static final String texttype = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/div[2]/div/div[1]/div/div/div[3]/ul/li[1]/span";
	public static final String typeques = "//*[@id=\"question-0\"]";
	public static final String saveques = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/button";
	public static final String delteques = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[4]/div/div/a[2]/span";
	public static final String confirm ="//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]/span/span";
	
	//assessment
	public static final String assessment = "//*[@id=\"JobInfo\"]/li[2]/a/span";
	public static final String createassessment = "//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/a/span[2]";
	public static final String existingassessment= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[1]/div[2]/div[1]/div/div[1]";
	public static final String requiredassessment ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[1]/div[2]/div[1]/div/div[3]/ul/li[1]/span/span";
	public static final String save1="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[6]/button]";
	public static final String delete1 ="//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div/div/a[2]/span";
	public static final String assessmentname = "//*[@id=\"assessment_name\"]";
	public static final String assessmentduration = "//*[@id=\"exam_duration\"]";
	public static final String marksperques = "//*[@id=\"marks_per_question\"]";
	
	
	public static final String addques = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/button";
	public static final String typeques1 = "//*[@id=\"question-0\"]";
	public static final String ansfield1 = "//*[@id=\"option-0-0\"]";
	public static final String  anffield2 = "//*[@id=\"option-0-1\"]";
	public static final String selectcorrectans ="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/div[2]/div[2]/div[2]/div/div/label/span";
	public static final String save = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]";
	
	//
	public static final String edit = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[2]/div/div/a[1]/span";
	public static final String addques3= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/button";
	public static final String input= "Wp.EasyJobsProject.Utils.XpathUtils.Evaluation";
	public static final String option1 ="//*[@id=\"option-2-0\"]";
	public static final String option2="//*[@id=\"option-2-1\"]";
	public static final String correct= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[4]/div[2]/div[2]/div[2]/div/div/label/span";
	public static final String update = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[6]/button";
	public static final String back = "//*[@id=\"appa\"]/div[1]/main/div/section/div[1]/a/i";
	public static final String delete= "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/div[3]/div/div/a[2]/span";
	
}


}