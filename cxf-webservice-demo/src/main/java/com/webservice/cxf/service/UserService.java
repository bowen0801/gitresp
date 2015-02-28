package com.webservice.cxf.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface UserService {
	
	public String getUserNameById(int id);
	
	

}
