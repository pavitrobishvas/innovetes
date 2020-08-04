package com.innoventes.user.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.innoventes.user.services.entity.EmployeeEntity;

public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Integer>  {
	
	@Query("SELECT t FROM EmployeeEntity t WHERE t.name = ?1")
	EmployeeEntity findByName(String eId);
	
	@Query("SELECT t FROM EmployeeEntity t WHERE t.id = ?1")
	EmployeeEntity findByById(long id);

}
