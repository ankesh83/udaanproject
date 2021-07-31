package com.ankesh.model;

import javax.persistence.Entity;

@Entity
public class AdminUser extends User{
	private boolean isAdmin;
	
}
