package com.innoventes.user.service;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.user.data.models.AddressDataModel;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.innoventes.user.services.entity.AddressEntity;
import com.innoventes.user.services.entity.EmployeeEntity;

public interface IAddressService {
	
	
	public ResponseEntity<Map<String, String>> saveAdd(AddressEntity userDataModel ) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public Page<AddressEntity> getAllAdd() throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<AddressEntity> getAdd(long eId) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<Map<String, String>> updateAdd(AddressDataModel userDataModel) throws DataPersistenceOperationException,ResourceNotFoundException,InvalidServiceRequestException;

	public ResponseEntity<?> partialUpdate(AddressDataModel updates) throws DataPersistenceOperationException,ResourceNotFoundException,InvalidServiceRequestException;



}
