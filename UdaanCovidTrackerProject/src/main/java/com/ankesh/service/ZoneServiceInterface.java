package com.ankesh.service;

import org.springframework.stereotype.Service;

import com.ankesh.model.Zone;
@Service
public interface ZoneServiceInterface {
	public Zone getZoneStatus(Zone zone);
}
