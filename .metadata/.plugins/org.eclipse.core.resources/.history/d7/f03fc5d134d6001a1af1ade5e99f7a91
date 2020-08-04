package com.innoventes.user.services.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ayusha.json.utils.JSONConverter;
import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.services.common.exceptions.ServiceRequestProcessor;
import com.ayusha.user.data.models.EmployeeAddressDataModel;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.custom.logger.logging.Logger;
import com.custom.logger.manager.LogManager;
import com.innoventes.user.service.IEmployeeAddressService;
import com.innoventes.user.service.IEmployeeService;
import com.innoventes.user.services.entity.EmployeeAddressEntity;
import com.innoventes.user.services.entity.EmployeeEntity;

/**
* This is the service api interface.
* This controls the access to the services
*
* @author  author1r
* @version 1.0
* @since    
*/
@RestController
@RequestMapping("/employeeAddress")
public class EmployeeAddressController extends ServiceRequestProcessor{
	
	/** Logger **/
	private static Logger LOG = LogManager.getLogger(EmployeeAddressController.class);
	
	/** service **/
	@Autowired
	private IEmployeeAddressService iEmployeeAddressService;
	

	/**
	 * post employeeAddress create controller
	 * 
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmp(@RequestBody EmployeeAddressEntity requestBody, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws  DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException {
		LOG.info("entered job notes creation - start");
		EmployeeAddressDataModel employeeAddressDataModel = null;
		
//		int size=0;
//		String strRequestBody = preProcess(requestBody,httpServletRequest,httpServletResponse);
//		
//		strRequestBody = postProcess(requestBody,httpServletRequest,httpServletResponse);
//		employeeAddressDataModel = (EmployeeAddressDataModel)JSONConverter.convertStringToPOJO(requestBody, EmployeeAddressDataModel.class);
//		
		ResponseEntity<Map<String, String>> response = iEmployeeAddressService.saveAdd(requestBody);
		LOG.info("successfully created  operation ");
		return JSONConverter.convertPOJOToString(response);

	}
	
	
	/**
	 * get all employee rel list controller
	 * 
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Page<EmployeeAddressEntity> getAllHr(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException{
		LOG.info("entered employee rel notes updation - start");
		return iEmployeeAddressService.getAllEmpAdd();
	}
	
	

	/**
	 * get one employee rel controller
	 * 
	 * 
	 */
	@RequestMapping(value = "/Em_get", method = RequestMethod.GET)
	public String getHr(@RequestParam("eId") String eId,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException{
		LOG.info("entered employee notes fetch - start");
		return JSONConverter.convertPOJOToString(iEmployeeAddressService.getEmpAdd(eId));
	}
	
	
	/**
	 * update employee controller
	 * 
	 */
	@RequestMapping(value = "/Em_update", method = RequestMethod.PUT)
	public String updateUser(@Valid @RequestBody String requestBody,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException{
		LOG.info("entered Employee rel notes updation - start");
		EmployeeDataModel employeeDataModel = null;
		
		String strRequestBody = preProcess(requestBody,httpServletRequest,httpServletResponse);
		strRequestBody = postProcess(requestBody,httpServletRequest,httpServletResponse);
		LOG.info("post process body"+strRequestBody);
		employeeDataModel = (EmployeeDataModel) JSONConverter.convertStringToPOJO(requestBody, EmployeeDataModel.class);
		
		
		LOG.info("successfully updated  operation ");
		return JSONConverter.convertPOJOToString(iEmployeeAddressService.updateEmpAdd(employeeDataModel));
	}
	
}
