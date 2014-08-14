package org.DataBillingService.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class DataService {
	
	@WebMethod
	public String login(@WebParam String user,@WebParam String pass){
		
		return "Hello"+user;
		
	}

}
