package com.ankesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.model.Zone;
import com.ankesh.model.ZoneStatus;
import com.ankesh.service.ZoneServiceInterface;
@RestController
@RequestMapping("/zone")
public class ZoneController {
	@Autowired
	private ZoneServiceInterface zoneservice;
	@GetMapping("/status")
	public ResponseEntity<ZoneStatus> getzonestatus(Zone zone){
		Zone zoneresult = zoneservice.getZoneStatus(zone);
		return ResponseEntity.ok(zoneresult.getStatus());
	}
}
