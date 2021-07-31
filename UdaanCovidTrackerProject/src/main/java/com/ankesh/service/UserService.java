package com.ankesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankesh.model.Assessment;
import com.ankesh.model.User;
import com.ankesh.repository.AssessRepo;
import com.ankesh.repository.Userrepo;

@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private Userrepo userrepo;
	@Autowired
	private AssessRepo assessrepo;
	@Override
	public User registeruser(User user) {
		return userrepo.save(user);
	}

	@Override
	public Assessment takeAssement(Assessment assessment) {
		float riskpercent = 0;
		int riskindicator = assessment.getSymptoms().size();
		riskindicator += (assessment.isTravelhistory() ?1 :0);
		riskindicator += (assessment.isContactWithCovidPatient() ?1 :0);
		if(riskindicator == 0)
			riskpercent = 5;
		else if(riskindicator == 1)
			riskpercent = 50;
		else if(riskindicator == 2)
			riskpercent = 75;
		else if(riskindicator > 2)
			riskpercent = 95;
		assessment.setRiskPercentage(riskpercent);
		Assessment completeassessment = assessrepo.save(assessment);
		return completeassessment;
	}

}
