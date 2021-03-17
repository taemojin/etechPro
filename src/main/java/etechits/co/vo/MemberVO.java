package etechits.co.vo;


import java.util.Date;
import java.io.Serializable;


public class MemberVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	transient private String userPass;
	transient private String userName;
	transient private String userCompany;  //회사명
	transient private String userZipcode;  //우편번호
	transient private String userAddress;  //주소 
	transient private String userAddr;  //주소 
	transient private String userSphone;   //핸드폰
	transient private String userPhone;    //전화번호
	transient private String email;        //이메일
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
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
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
				+ ", userAddr=" + userAddr + ""				
				+ ", userSphone=" + userSphone + ""
				+ ", userPhone=" + userPhone + ""		
				+ ", email=" + email + ""				
				+ ", regDate="+ regDate + "]";
	}

}
