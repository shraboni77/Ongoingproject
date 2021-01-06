package Wp.EasyJobsProject.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class LocatorUtils {
	public static class Login_Page {
		
	public static final String register_link_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[1]/a";

	public static final String email_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/input";
	public static final String password_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
	public static final String signin_button_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/button";

}

public static class Register_Page {

	public static final String register_link_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[1]/a";

	public static final String first_name_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[1]/div/input";
	public static final String last_name_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[1]/div[2]/div/input";
	public static final String email_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[2]/input";
	public static final String password_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[3]/input";
	public static final String confirm_password_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/div[4]/input";

	public static final String signup_button_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/form/button";
}

public static class Subscribe_Page {

	public static final String continue_as_candidate_xpath = "//*[@id=\"appa\"]/div[1]/div[1]/button/div[2]";

	public static final String free_subscription_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[2]/section/div/ul/li[1]/div/label";
	public static final String startup_subscription_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[2]/section/div/ul/li[2]/div/label";
	public static final String bussiness_subscription_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[2]/section/div/ul/li[3]/div/label";

	public static final String confirm_button_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div[2]/div[4]/button";
}

public static class Create_Company_Page {

	public static final String company_name_id = "company-name";
	public static final String company_username_id = "username";
	public static final String company_phone_id = "phone-no";

	public static final String click_industry_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[4]/div/div[1]";
	public static final String industry_id = "industry";

	public static final String company_website_id = "website";

	public static final String number_of_emp_1_30_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[6]/div[1]/div/label";
	public static final String number_of_emp_31_60_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[6]/div[2]/div/label";
	public static final String number_of_emp_61_90_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[6]/div[3]/div/label";
	public static final String number_of_emp_100_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[6]/div[4]/div/label";

	public static final String TermsAndPolicy_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/label/span";

	public static final String getstarted_button_xpath = "//*[@id=\"appa\"]/div[1]/div[3]/div/form/div[7]/button";

}

public static class Create_A_New_Job_Page {

	public static final String job_title_id = "job-title";
	public static final String job_details_xpath = "//*[@id=\"job-details\"]/div[2]/div[1]";

	public static final String click_catagory_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[3]/div/div/div[1]";
	public static final String catagory_id = "category";

	public static final String vacancies_id = "vacancies";
	
	public static final String allow_remote_id = "allow___remote";

	public static final String click_country_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[6]/div/div/div[1]";
	public static final String country_id = "country";

	public static final String click_state_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[7]/div/div/div[1]";
	public static final String state_id = "state";

	public static final String click_city_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[8]/div/div/div[1]";
	public static final String city_id = "city";

	public static final String expiry_date_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/input";
	public static final String pick_a_date_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[2]/div/div[2]/div[43]/span";
	public static final String press_ok_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[9]/div/div/div/div/div[2]/div[3]/div[2]";
	
	
	public static final String click_add_skills_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[1]/div/div[10]/div/div/div[1]";
	public static final String skills_id = "skills";

	public static final String click_employment_type_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[1]/div/div/div[1]";
	public static final String employment_type_id = "employment_type";

	public static final String click_experience_level_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[2]/div/div/div[1]";
	public static final String experience_level_id = "experience_level";

	public static final String click_salary_type_dropDown_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[3]/div/div/div[1]";
	public static final String salary_type_id = "salary_type";

	public static final String salary_id = "salary";

	public static final String office_time_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[2]/div/div[5]/div/input";

	public static final String show_company_benefits_id = "has-benefits";
	
	public static final String banner_image_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[3]/div/div/div/div[1]/label/input";
	public static final String crop_image = "//*[@id=\"vue-cropper-modal\"]/div/div/div[3]/div/button[2]";
	
	public static final String save_and_continue_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div[2]/form/div[4]/button";
}

public static class Choose_Existing_Quiz_Set {
	public static final String click_select_existng_QS_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[1]";
	public static final String quiz_set_id = "quiz_set";
	public static final String quiz_set= "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[3]/ul/li[1]/span";
	public static final String exam_duration_id = "//*[@id=\"exam_duration\"]";
	public static final String marks_per_question_id = "//*[@id=\"marks_per_question\"]";
	
	public static final String save_and_publish_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[9]/button";
	
}

public static class Choose_Existing_Screen_Test_Set {
	
	public static final String click_select_existing_ST_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[1]";
	public static final String question_set_id = "//*[@id=\"question_set\"]";
	public static final String question_set	="//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div/div/div[3]/ul/li[1]/span";
	public static final String skip_and_next = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[7]/div/a";
	public static final String save_and_continue_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[7]/div/button";
	

}

public static class Custom_Job_Apply_Field {
	
	public static final String uncheck_basic_information_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[1]/div/div[1]/label/span";
	public static final String uncheck_education_qualification_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[2]/div/div[1]/label/span";
	public static final String uncheck_employment_history_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[3]/div/div[1]/label/span";
	public static final String uncheck_others_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[4]/div/div[1]/label/span";
	public static final String uncheck_documents_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[2]/div[2]/div[5]/div/div[1]/label/span";

	public static final String save_and_continue_AJAF_xpath = "//*[@id=\"custom-field\"]/div/div/form/div[3]/button[2]";
}

public static class Publish_job{
	
	public static final String publish_button_yes_xpath = "//*[@id=\"app\"]/div[6]/div/div[2]/div/div/div/div[2]/button[2]";
	
	
	public static final String succecss_job_publised_xpath = "//*[@id=\"share-modal\"]/div/div/div/div/p";
	
	public static final String copy_job_post_url = "//*[@id=\"share-modal\"]/div/div/div/div/div[2]/button";
	
	public static final String close_window_for_job_published = "//*[@id=\"share-modal\"]/div/div/div/button/span";
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



public static class Quiz_Exam {
	public static final String question_option_1_xpath = "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[2]/div[2]/div[1]/label/div";
	public static final String question_1_save = "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[3]/div/button[2]";
	public static final String question_option_2_xpath = "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[2]/div[2]/div[1]/label/div";
	public static final String question_2_save = "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[3]/div/button[2]";
	public static final String finish_quiz_button_xpath = "//*[@id=\"applyWrapper\"]/section/div[3]/div/div[2]/div/button";
}

public static class Question_Set_Page {
	public static final String click_on_questionset_option_xpath = "//*[@id=\"appa\"]/div[1]/section/div[2]/nav/ul/li[5]/a/div[2]";
	public static final String click_on_add_new_set_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/div/a/span[2]";
	
	
	public static final String set_name_id = "set_name";
	
	public static final String click_set_type_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[1]/div/div[2]/div/div[1]";
	public static final String set_type_id = "set_type";
	
	public static final String add_question_0_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/button/span[2]";
	public static final String add_question_1_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/button/span[2]";

	
	//if quiz
//	public static final String add_question_0_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/button/span[2]";
	public static final String type_question_0_id = "question-0";
	public static final String quiz_option_0_0_id = "option-0-0";
	public static final String quiz_option_0_1_id = "option-0-1";
	public static final String correct_0_0_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/div[2]/div[2]/div[1]/div/div/label/span";
	
//	public static final String add_question_1_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/button/span[2]";
	public static final String type_question_1_id = "question-1";
	public static final String quiz_option_1_0_id = "option-1-0";
	public static final String quiz_option_1_1_id = "option-1-1";
	public static final String quiz_correct_1_1_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div[2]/div[2]/div[1]/div/div/label/span";
	
	
	//if screen test
	public static final String click_on_question_1_type_for_ST_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[2]/div[2]/div/div[1]/div/div/div[1]";
	public static final String click_on_question_2_type_for_ST_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div[2]/div/div[1]/div/div/div[1]";
	
	public static final String question_type_1_for_ST_id = "question_type-0";
	public static final String question_type_2_for_ST_id = "question_type-1";
	
	public static final String type_question_1_for_ST_id = "question-0";
	public static final String type_question_2_for_ST_id = "question-1";
	
	public static final String screen_option_2_0_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div[2]/div[2]/div[1]/div/div/input";
	public static final String screen_option_2_1_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div[2]/div[2]/div[2]/div/div/input";

	public static final String screen_correct_2_0_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[3]/div[2]/div[2]/div[1]/div/div/label/span";
	
	
	public static final String save_question_Set_xpath = "//*[@id=\"appa\"]/div[1]/main/div/section/form/div[5]/button";
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

