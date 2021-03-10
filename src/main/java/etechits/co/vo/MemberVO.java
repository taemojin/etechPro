package etechits.co.vo;


import java.util.Date;


public class MemberVO {

	private String userId;
	private String userPass;
	private String userName;
	private String userCompany;  //회사명
	private String userZipcode;  //우편번호
	private String userAddress;  //주소 
	private String userSphone;   //핸드폰
	private String userPhone;    //전화번호
	private String email;        //이메일
	private Date regDate; 
	
	

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
	public String getUserCompany() {
		return userCompany;
	}
	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}
	public String getUserZipcode() {
		return userZipcode;
	}
	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserSphone() {
		return userSphone;
	}
	public void setUserSphone(String userSphone) {
		this.userSphone = userSphone;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ""
				+ ", userPass=" + userPass + ""
				+ ", userName=" + userName + ""
				+ ", userCompany=" + userCompany + ""
				+ ", userZipcode=" + userZipcode + ""
				+ ", userAddress=" + userAddress + ""
				+ ", userSphone=" + userSphone + ""
				+ ", userPhone=" + userPhone + ""		
				+ ", email=" + email + ""				
				+ ", regDate="+ regDate + "]";
	}

}
