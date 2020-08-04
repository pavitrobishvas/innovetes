package com.innoventes.user.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.user.data.models.EmployeeAddressDataModel;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.custom.logger.logging.Logger;
import com.custom.logger.manager.LogManager;
import com.innoventes.user.services.entity.AddressEntity;
import com.innoventes.user.services.entity.EmployeeAddressEntity;
import com.innoventes.user.services.entity.EmployeeEntity;
import com.innoventes.user.services.repository.IEmployeeAddressRepository;
import com.innoventes.user.services.repository.IEmployeeRepository;
import com.innoventes.user.validations.EmployeeAddressValidation;

/**
 * 
 * @author author1
 *
 * EmployeeAddress Data Model class
 * 
 * 1. Recording (single):
 *      a. Persisting in DB
 *      b. on Success - sending 
 *      c. assigning service invoking
 * 
 * 2. Update:
 *     a. On change of status -
 *     
 * 3. Batch Recording:
 *     a.  Persisting in DB
 *     b. on Success - 
 *     c. assigning service invoking - Individually
 *      
 *  4. Search:
 *      a. search based on date, user, customer,logged date, issue,servicetype,serialnumber
 *      
 *  5. Sorting:
 *      a. soring based on logged date,status,servicetype (ASC | DSC)
 */
@Service
public class EmployeeAddressService implements IEmployeeAddressService {
	
	/** LOGGER **/
	private static Logger LOG = LogManager.getLogger(EmployeeAddressService.class);
	
	/** repository **/
	@Autowired
	private IEmployeeAddressRepository iEmployeeRepository;
	
	/** repository **/
	@Autowired
	private IEmployeeRepository iEmRepository;
	/** validation **/
	@Autowired
	private EmployeeAddressValidation validation;
	
	
	/**
	 * default constructor
	 */
	public EmployeeAddressService() {
		LOG.info("EmployeeAddress Service Constructor");
	}	
	
	@Override
	public ResponseEntity<Map<String, String>> saveAdd(EmployeeAddressDataModel employeeAddressDataModel)
			throws DataPersistenceOperationException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		LOG.info("HERE"+employeeAddressDataModel);
		//EmployeeAddressEntity employeeAddressEntity = new EmployeeAddressEntity();
		EmployeeAddressEntity employeeEntity = new EmployeeAddressEntity();
		Map<String,String> response = new HashMap<String, String>();
        //validation employee and address field		
		//validation.validate(e);
		//Object converstion
		
		BeanUtils.copyProperties(employeeAddressDataModel, employeeEntity);
		iEmployeeRepository.save(employeeEntity);
		//BeanUtils.copyProperties(employeeAddressDataModel, employeeEntity);
		response.put("message", "EmployeeAddress Added successfully");
		return  ResponseEntity.ok().body(response);
	}
	
	/**
	 * get All  Details with pagination
	 */
	@Override
	public Page<EmployeeAddressEntity> getAllEmpAdd() throws DataPersistenceOperationException, Exception,
			InvalidServiceRequestException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		Pageable paging = PageRequest.of(0, Integer.MAX_VALUE);
		Page<EmployeeAddressEntity> page = iEmployeeRepository.findAll(paging);
		return page;
	}
	
	
	/**
	 * get one employee Details
	 */

	@Override
	public ResponseEntity<EmployeeAddressEntity> getEmpAdd(long id)
			throws DataPersistenceOperationException, ResourceNotFoundException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		EmployeeAddressEntity hrEntity =iEmployeeRepository.findById(id);
		if (hrEntity!=null) {
			return new ResponseEntity<EmployeeAddressEntity>(hrEntity, HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Employee  not Exists...");
		}
		
	}
	
	/**
	 * update employee Details
	 * with id
	 */

	@Override
	public ResponseEntity<Map<String, String>> updateEmpAdd(EmployeeDataModel userDataModel)
			throws DataPersistenceOperationException,ResourceNotFoundException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		Map<String,String> response = new HashMap<String, String>();
//		EmployeeAddressEntity hrEntity = iEmployeeRepository.findByById(userDataModel.getId());
//		if (hrEntity!=null) {
//			BeanUtils.copyProperties(userDataModel, hrEntity);
//			LOG.info("response"+hrEntity);
//			iEmployeeRepository.save(hrEntity);
//			response.put("message", "Employee Address Update successfully");
//		}else {
//			throw new ResourceNotFoundException("Employee Address not Exists!!");
//		}
		return  ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<Map<String, String>> saveEmAd(EmployeeAddressEntity requestBody)
			throws DataPersistenceOperationException, ResourceNotFoundException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		LOG.info("HERE"+requestBody);
		//EmployeeAddressEntity employeeAddressEntity = new EmployeeAddressEntity();
		EmployeeAddressEntity employeeEntity = new EmployeeAddressEntity();
		Map<String,String> response = new HashMap<String, String>();
        //validation employee and address field		
		//validation.validate(e);
		//Object converstion
		
		//BeanUtils.copyProperties(employeeAddressDataModel, employeeEntity);
		iEmployeeRepository.save(requestBody);
		//BeanUtils.copyProperties(employeeAddressDataModel, employeeEntity);
		response.put("message", "EmployeeAddress Added successfully");
		
		
		return  ResponseEntity.ok().body(response);

	}


}
