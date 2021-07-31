package com.ankesh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankesh.model.CovidStatus;
import com.ankesh.model.CovidTest;
import com.ankesh.model.User;
import com.ankesh.repository.TestRepo;
import com.ankesh.repository.Userrepo;
@Service
public class AdminService implements AdminServiceInterface{
	@Autowired
	private TestRepo testrepo;
	@Autowired
	private Userrepo userrepo;
	@Override
	public CovidTest updatecovidresult(CovidTest test) {
		if(test.getResult() == CovidStatus.POSITIVE) {
			Optional<User> usr = userrepo.findById(test.getUserID());
			if(usr.isEmpty()) {
				throw new RuntimeException("user is not registered");
			}
			usr.get().setStatus(CovidStatus.POSITIVE);
			User postiveuser = userrepo.save(usr.get());
		}
			
		return testrepo.save(test);
	}

}
