package Wp.EasyJobsProject.DTO;

public class CreateProfileDTO {
	
	private String phnnumber;
	private String nationalid;
	private String linkedinprofilelink;
	private String facebookprofilelink;
	
	public String getPhnnumber() {
		return phnnumber;
	}
	public void setPhnnumber(String phnnumber) {
		this.phnnumber = phnnumber;
	}
	public String getNationalid() {
		return nationalid;
	}
	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}
	
	public String getLinkedinprofilelink() {
		return linkedinprofilelink;
	}
	public void setLinkedinprofilelink(String linkedinprofilelink) {
		this.linkedinprofilelink = linkedinprofilelink;
	}
	public String getFacebookprofilelink() {
		return facebookprofilelink;
	}
	public void setFacebookprofilelink(String facebookprofilelink) {
		this.facebookprofilelink = facebookprofilelink;
	}
	@Override
	public String toString() {
		return "CreateProfileDTO [phnnumber=" + phnnumber + ", nationalid=" + nationalid + ", linkedinprofilelink=" + linkedinprofilelink
				+ ", facebookprofilelink=" + facebookprofilelink + "]";
	}
	
}