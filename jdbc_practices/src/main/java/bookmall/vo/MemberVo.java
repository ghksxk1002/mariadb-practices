package bookmall.vo;

public class MemberVo {
	private int no;
	private String name;
	private String phoneNo;
	private String email;
	private String password;
	
//	public MemberVo(int no, String name, String phoneNo, String email, String password) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.phoneNo = phoneNo;
//		this.email = email;
//		this.password = password;
//	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNO) {
		this.phoneNo = phoneNO;
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
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", password="
				+ password + "]";
	}
}
