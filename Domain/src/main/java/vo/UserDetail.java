package vo;

import java.sql.Timestamp;

public class UserDetail {

	private String id;
	private String name;
	private String email;
	private String address;
	private String phone;
	private Timestamp jointime;
	private int status;
	private int age;
	private String language;
	private String nickname;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getJointime() {
		return jointime;
	}
	public void setJointime(Timestamp jointime) {
		this.jointime = jointime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", jointime="
				+ jointime + ", status=" + status + ", age=" + age
				+ ", language=" + language + ", nickname=" + nickname + "]";
	}
	
	
}
