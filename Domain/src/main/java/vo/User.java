package vo;

public class User {

	private String id;
	private String password;
	private UserDetail userDetail;
	private UserInfo userInfo;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", userDetail="
				+ userDetail + ", userInfo=" + userInfo + "]";
		
	}
	
	
	
	
	
}
