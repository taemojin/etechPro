package etechits.co.vo;


import java.util.Date;


public class MemberVO {

	private String userId;
	private String userPass;
	private String userName;
	private String usercompany; //사용자 회사
	private String userzipcode; //회원가입 우편번호
	private String useraddress; //회원가입 회사 주소 
	private String usersphone; //회원가입 핸드폰 번호
	private String userphone; //회원가입 전화번호
	private String email;
	private Date regDate; 
	
	
	public String getUsercompany() {
		return usercompany;
	}
	public void setUsercompany(String usercompany) {
		this.usercompany = usercompany;
	}
	public String getUserzipcode() {
		return userzipcode;
	}
	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUsersphone() {
		return usersphone;
	}
	public void setUsersphone(String usersphone) {
		this.usersphone = usersphone;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", regDate="
				+ regDate + "]";
	}

}
