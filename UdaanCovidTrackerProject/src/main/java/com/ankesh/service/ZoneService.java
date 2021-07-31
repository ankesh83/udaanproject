package com.ankesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankesh.model.CovidStatus;
import com.ankesh.model.User;
import com.ankesh.model.Zone;
import com.ankesh.model.ZoneStatus;
import com.ankesh.repository.Userrepo;
import com.ankesh.repository.ZoneRepo;
@Service
public class ZoneService implements ZoneServiceInterface{
	@Autowired
	private ZoneRepo zonerepo;
	@Autowired
	private Userrepo userrepo;
	@Override
	public Zone getZoneStatus(Zone zone) {
		List<User> userbyzone = userrepo.findAllByPincodeAndStatus(zone.getPincode(),CovidStatus.POSITIVE);
		if(userbyzone.size() == 0)
			zone.setStatus(ZoneStatus.GREEN);
		else if(userbyzone.size() < 5)
			zone.setStatus(ZoneStatus.ORANGE);
		else
			zone.setStatus(ZoneStatus.RED);
		return zone;
	}

}
