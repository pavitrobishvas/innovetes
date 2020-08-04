package com.ayusha.user.services.constants;

/**
 * 
 * @author author
 *
 */
public class UserServiceConstants {


	/** get ticket **/
	public final static String GET_USER_DETAILS_BY_USERID_SERVICE_NAME="users/user/userId?userid=$1";
	/** get ticket **/
	public final static String GET_USER_DETAILS_BY_USEREMAIL_SERVICE_NAME="users/user/emailid?emailid=$1";
	/** get ticket **/
	public final static String GET_USER_DETAILS_BY_USEREPHONE_SERVICE_NAME="users/user/phonenumber?phonenumber=$1";
	/** get ticket **/
	public final static String GET_USER_DETAILS_BY_USERNAME_SERVICE_NAME="users/user/firstname?firstname=$1";
	
	/** get ticket **/
	public final static String GET_LOCATIONS_USER_DETAILS_BY_USERNAME_SERVICE_NAME="users/user/locations?locationid=$1";
	/** get ticket **/
	public final static String GET_USERS_SERVICE_NAME="users/all";
	
	/** get ticket **/
	public final static String UPDATE_USER_DETAILS_SERVICE_NAME="users/user/update";
	/** get ticket **/
	public final static String ADD_USER_DETAILS_SERVICE_NAME="users/user/add";
}
