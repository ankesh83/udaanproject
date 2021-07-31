package com.ankesh.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Assessment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long assessmentId;
	private long userId;
	@ElementCollection
	private List<String> symptoms;
	private boolean travelhistory;
	private boolean contactWithCovidPatient;
	private float riskPercentage;
	public float getRiskPercentage() {
		return riskPercentage;
	}
	public void setRiskPercentage(float riskPercentage) {
		this.riskPercentage = riskPercentage;
	}
	public long getAssessmentId() {
		return assessmentId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}
	public boolean isTravelhistory() {
		return travelhistory;
	}
	public void setTravelhistory(boolean travelhistory) {
		this.travelhistory = travelhistory;
	}
	public boolean isContactWithCovidPatient() {
		return contactWithCovidPatient;
	}
	public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}
	
}
