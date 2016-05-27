package vo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class Seller {

	/**
	 * test
	 */
	private String id;
	private String licensenumber;
	private String telephone;
	private int status;
	private Timestamp jointime;
	private Timestamp lastvisittime;
	private int parcelcode;
	
	/**
	 * sellerLang
	 * List안에는 각 언어별로 map형태로 들어감
	 * map의 키 값은 언어명으로 설정
	 * map의 values값은 sellerLang 객체로 설정
	 */
	
	private List<Map<String, SellerLang>> languageList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLicensenumber() {
		return licensenumber;
	}

	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getJointime() {
		return jointime;
	}

	public void setJointime(Timestamp jointime) {
		this.jointime = jointime;
	}

	public Timestamp getLastvisittime() {
		return lastvisittime;
	}

	public void setLastvisittime(Timestamp lastvisittime) {
		this.lastvisittime = lastvisittime;
	}

	public int getParcelcode() {
		return parcelcode;
	}

	public void setParcelcode(int parcelcode) {
		this.parcelcode = parcelcode;
	}

	public List<Map<String, SellerLang>> getLanguageList() {
		return languageList;
	}

	public void setLanguageList(List<Map<String, SellerLang>> languageList) {
		this.languageList = languageList;
	}
	
	
	
	
}
