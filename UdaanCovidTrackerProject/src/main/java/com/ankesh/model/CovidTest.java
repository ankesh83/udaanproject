package com.ankesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CovidTest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long testId;
	private long userID;
	private long adminId;
	private CovidStatus result;
	public long getTestId() {
		return testId;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public CovidStatus getResult() {
		return result;
	}
	public void setResult(CovidStatus result) {
		this.result = result;
	}
	
	
}
