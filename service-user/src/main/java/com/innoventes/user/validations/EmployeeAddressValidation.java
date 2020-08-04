package com.innoventes.user.validations;

import org.springframework.stereotype.Component;

import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.user.data.models.EmployeeAddressDataModel;
import com.custom.logger.logging.Logger;
import com.custom.logger.manager.LogManager;

/**
 * 
 * @author author1
 * Date : 
 * EmployeeAddress Data Model class
 * Defines the  service data validation methods
 *
 */
@Component
public class EmployeeAddressValidation {
	
	/** LOGGER **/
	private static Logger LOG = LogManager.getLogger(EmployeeAddressValidation.class);
	
	/**
	 * default constructor
	 */
	public EmployeeAddressValidation() {
		
	}
	
	/**
	 * validate
	 */
	public boolean validate(EmployeeAddressDataModel employeeAddressDataModel) throws InvalidServiceRequestException{
		
		if(employeeAddressDataModel==null) {
			throw new InvalidServiceRequestException("Invalid service request data");
		}else if(employeeAddressDataModel.getEmployee()==null || (employeeAddressDataModel.getEmployee().toString().length()<1)) {
			throw new InvalidServiceRequestException("Invalid employee  request data");
		}else if(employeeAddressDataModel.getAddress()==null || (employeeAddressDataModel.getAddress().toString().length()<1)) {
			throw new InvalidServiceRequestException("Invalid address  request data");
		}
		return true;
	}

}
