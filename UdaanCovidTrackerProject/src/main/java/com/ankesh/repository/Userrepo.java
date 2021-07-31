package com.ankesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankesh.model.CovidStatus;
import com.ankesh.model.User;
@Repository
public interface Userrepo extends JpaRepository<User,Long>{

	List<User> findAllByPincodeAndStatus(int pincode, CovidStatus positive);

}
