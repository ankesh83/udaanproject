package com.ankesh.service;

import org.springframework.stereotype.Service;

import com.ankesh.model.Assessment;
import com.ankesh.model.User;
@Service
public interface UserServiceInterface {

	public User registeruser(User user);

	public Assessment takeAssement(Assessment assessment);

}
