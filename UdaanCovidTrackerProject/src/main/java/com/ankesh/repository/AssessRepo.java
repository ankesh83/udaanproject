package com.ankesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankesh.model.Assessment;
@Repository
public interface AssessRepo extends JpaRepository<Assessment,Long>{

}
