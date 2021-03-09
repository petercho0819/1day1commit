package mvc.dto;

import java.sql.Date;

public class MemberDTO {

	public MemberDTO() {}
	

	private int memberNo;
	private String memeberId;
	private String memeberPwd;
	private String memberName;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private int age;
	private Date date;
	public MemberDTO(int memberNo, String memeberId, String memeberPwd, String memberName, String gender, String email,
			String phone, String address, int age, Date date) {
		super();
		this.memberNo = memberNo;
		this.memeberId = memeberId;
		this.memeberPwd = memeberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.date = date;
	}
	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memeberId=" + memeberId + ", memeberPwd=" + memeberPwd
				+ ", memberName=" + memberName + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", age=" + age + ", date=" + date + "]";
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemeberId() {
		return memeberId;
	}
	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}
	public String getMemeberPwd() {
		return memeberPwd;
	}
	public void setMemeberPwd(String memeberPwd) {
		this.memeberPwd = memeberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
