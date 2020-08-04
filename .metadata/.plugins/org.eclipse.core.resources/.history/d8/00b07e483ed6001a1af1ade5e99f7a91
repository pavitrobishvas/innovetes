package com.innoventes.user.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innoventes.user.services.entity.EmployeeAddressEntity;
import com.innoventes.user.services.entity.EmployeeEntity;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddressEntity, Integer>{

	
//	@Query("SELECT t FROM EmployeeAddressEntity t WHERE t.name = ?1")
//	EmployeeAddressEntity findByName(String eId);
	
	@Query("SELECT t FROM EmployeeAddressEntity t WHERE t.id = ?1")
	EmployeeAddressEntity findByById(long id);
}
