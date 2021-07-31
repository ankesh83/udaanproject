package com.ankesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.model.Assessment;
import com.ankesh.model.User;
import com.ankesh.service.UserServiceInterface;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceInterface userservice;
	@PostMapping("/user")
	public ResponseEntity<Long> registerUser(User user){
		User usr = userservice.registeruser(user);
		return ResponseEntity.ok(usr.getUserId());
	}
	@PostMapping("/assess")
	public ResponseEntity<Float> takeAssesment(Assessment assessment){
		Assessment assment_result = userservice.takeAssement(assessment);
		return ResponseEntity.ok(assment_result.getRiskPercentage());
	}
}
