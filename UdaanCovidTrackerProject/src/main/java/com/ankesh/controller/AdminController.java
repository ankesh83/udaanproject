package com.ankesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.model.CovidStatus;
import com.ankesh.model.CovidTest;
import com.ankesh.service.AdminServiceInterface;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminServiceInterface admservice;
	@PostMapping("/test/covid")
	public ResponseEntity<CovidStatus> updatecovidresult(CovidTest test){
		CovidTest testresult = admservice.updatecovidresult(test);
		return ResponseEntity.ok(testresult.getResult());
	}
}
