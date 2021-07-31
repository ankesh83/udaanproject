package com.ankesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankesh.model.Zone;
@Repository
public interface ZoneRepo extends JpaRepository<Zone,Long>{

}
