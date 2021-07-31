package com.ankesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankesh.model.CovidTest;
@Repository
public interface TestRepo extends JpaRepository<CovidTest, Long>{

}
