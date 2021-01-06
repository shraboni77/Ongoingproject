package Wp.EasyJobsProject.DTO;

public class CandRegDTO {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String confrimpass;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfrimpass() {
		return confrimpass;
	}
	public void setConfrimpass(String confrimpass) {
		this.confrimpass = confrimpass;
	}
	@Override
	public String toString() {
		return "CandRegDTO [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", confrimpass=" + confrimpass + "]";
	}
	
	

}
