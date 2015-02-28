package com.webservice.cxf.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.webservice.cxf.service.UserService;
@WebService
@SOAPBinding(style = Style.RPC)
public class UserServiceImpl implements UserService {

	@Override
	public String getUserNameById(int id) {
		if(id==1){
			return "小明";
		}else{
			return "id错误";
		}
	}

}
