package Wp.EasyJobsProject.DTO;

public class CreateJobDTO {

	private String jobtitle;
	private String jobdetails;
	private String responsibilites;
	

	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdetails() {
		return jobdetails;
	}
	public void setJobdetails(String jobdetails) {
		this.jobdetails = jobdetails;
	}
	public String getResponsibilites() {
		return responsibilites;
	}
	public void setResponsibilites(String responsibilites) {
		this.responsibilites = responsibilites;
	}
	@Override
	public String toString() {
		return "CreateJobDTO [jobtitle=" + jobtitle + ", jobdetails=" + jobdetails + ", responsibilites="
				+ responsibilites + "]";
	}
	
	
	
	
	}
	
	
		
