package com.ankesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zone {
	@Id
	private int pincode;
	private ZoneStatus status;
	public int getPincode() {
		return pincode;
	}
	public ZoneStatus getStatus() {
		return status;
	}
	public void setStatus(ZoneStatus status) {
		this.status = status;
	}
	
}
