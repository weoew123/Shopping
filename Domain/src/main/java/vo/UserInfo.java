package vo;

import java.sql.Time;
import java.sql.Timestamp;

public class UserInfo {


	private String id;
	private int milage;
	private int visitcount;
	private Timestamp exittime;
	private Time lastvisittime;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getMilage() {
		return milage;
	}


	public void setMilage(int milage) {
		this.milage = milage;
	}


	public int getVisitcount() {
		return visitcount;
	}


	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}


	public Timestamp getExittime() {
		return exittime;
	}


	public void setExittime(Timestamp exittime) {
		this.exittime = exittime;
	}


	public Time getLastvisittime() {
		return lastvisittime;
	}


	public void setLastvisittime(Time lastvisittime) {
		this.lastvisittime = lastvisittime;
	}


	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", milage=" + milage + ", visitcount="
				+ visitcount + ", exittime=" + exittime + ", lastvisittime="
				+ lastvisittime + "]";

	}	
}
