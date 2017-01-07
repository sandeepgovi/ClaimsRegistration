package com.lm.hackathon.service;

import org.springframework.stereotype.Service;

import com.lm.hackathon.controller.model.SignUpDetails;
import com.lm.hackathon.dao.RegistrationDAO;

@Service("reistrSvc")
public class RegistrationSvc {
	
	private RegistrationDAO registerDAOObj;

	public RegistrationDAO getRegisterDAOObj() {
		return registerDAOObj;
	}

	public void setRegisterDAOObj(RegistrationDAO registerDAOObj) {
		this.registerDAOObj = registerDAOObj;
	}
	
	
	public Boolean registerClaim(SignUpDetails signUpsubreq){
		
		
		return registerDAOObj.registerNewUser(signUpsubreq);
		
	}

}
