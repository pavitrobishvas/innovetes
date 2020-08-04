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
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.MethodArgumentBuilder;

import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.custom.logger.logging.Logger;
import com.custom.logger.manager.LogManager;
import com.innoventes.user.services.entity.EmployeeEntity;
import com.innoventes.user.services.repository.IEmployeeRepository;


/**
 * 
 * @author author1
 * Date : 03-Aug-2020
 * Employee Model class
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
public class EmployeeService implements IEmployeeService{

	
	/** LOGGER **/
	private static Logger LOG = LogManager.getLogger(EmployeeService.class);
	
	/** repository **/
	@Autowired
	private IEmployeeRepository iEmployeeRepository;
	
	/**
	 * default constructor
	 */
	public EmployeeService() {
		LOG.info("Employee Service Constructor");
	}	
	@Override
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> saveAdd(EmployeeEntity userDataModel)
			throws DataPersistenceOperationException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		LOG.info("HERE"+userDataModel);
//		EmployeeEntity employeeEntity = new EmployeeEntity();
		Map<String,String> response = new HashMap<String, String>();
//		BeanUtils.copyProperties(userDataModel, employeeEntity);
		EmployeeEntity entity=iEmployeeRepository.save(userDataModel);
		response.put("message", "Employee Register successfully");
		return  ResponseEntity.ok().body(response);
	}
	
	/**
	 * get All  Details with pagination
	 */
	@Override
	public Page<EmployeeEntity> getAllEmp() throws DataPersistenceOperationException, Exception,
			InvalidServiceRequestException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		Pageable paging = PageRequest.of(0, Integer.MAX_VALUE);
		Page<EmployeeEntity> page = iEmployeeRepository.findAll(paging);
		return page;
	}
	
	
	/**
	 * get one employee Details
	 */

	@Override
	public ResponseEntity<EmployeeEntity> getEmp(String name)
			throws DataPersistenceOperationException, ResourceNotFoundException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		EmployeeEntity hrEntity =iEmployeeRepository.findByName(name);
		if (hrEntity!=null) {
			return new ResponseEntity<EmployeeEntity>(hrEntity, HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Employee not Exists...");
		}
	}
	
	/**
	 * update employee Details
	 * with id
	 */

	@Override
	public ResponseEntity<Map<String, String>> updateEmp(EmployeeDataModel userDataModel)
			throws DataPersistenceOperationException,ResourceNotFoundException, InvalidServiceRequestException {
		// TODO Auto-generated method stub
		Map<String,String> response = new HashMap<String, String>();
		EmployeeEntity hrEntity = iEmployeeRepository.findByById(userDataModel.getId());
		if (hrEntity!=null) {
			BeanUtils.copyProperties(userDataModel, hrEntity);
			LOG.info("response"+hrEntity);
			iEmployeeRepository.save(hrEntity);
			response.put("message", "Employee Update successfully");
		}else {
			throw new ResourceNotFoundException("Employee not Exists!!");
		}
		return  ResponseEntity.ok().body(response);
	}

}
