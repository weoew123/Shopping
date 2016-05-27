package vo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class Product {
	/**
	 * 이것은 존나 테스트입니다
	 * 뻨유ㅡ
	 * 니가 이걸 볼수 있으면 성공한겁니다
	 */
	
	private String productId;
	private String sellerId;
	private int maxQuantity;
	private int sellcnt;
	private Timestamp limitTime;
	private Timestamp registTime;
	private String option;
	private double commission;
	private String imagepath;
	private int status;
	private List<Map<String, ProductLang>> languageList;

	private String name;
	private String content;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public int getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	public int getSellcnt() {
		return sellcnt;
	}
	public void setSellcnt(int sellcnt) {
		this.sellcnt = sellcnt;
	}
	public Timestamp getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(Timestamp limitTime) {
		this.limitTime = limitTime;
	}
	public Timestamp getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Map<String, ProductLang>> getLanguageList() {
		return languageList;
	}
	public void setLanguageList(List<Map<String, ProductLang>> languageList) {
		this.languageList = languageList;
	}
	
	

	
	
}
