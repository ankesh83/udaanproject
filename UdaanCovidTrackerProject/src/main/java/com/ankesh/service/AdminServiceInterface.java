package com.ankesh.service;

import org.springframework.stereotype.Service;

import com.ankesh.model.CovidTest;
@Service
public interface AdminServiceInterface {

	public CovidTest updatecovidresult(CovidTest test);

}
