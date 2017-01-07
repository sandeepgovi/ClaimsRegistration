package com.lm.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.hackathon.controller.model.SignUpDetails;
import com.lm.hackathon.service.RegistrationSvc;

@RestController
public class SignUpController {
	
	
	private RegistrationSvc reistrSvc;
	
	
	@Autowired
	public SignUpController(RegistrationSvc reistrSvc) {
		super();
		this.reistrSvc = reistrSvc;
	}



	@RequestMapping(value="/register.htm",method=RequestMethod.POST ,consumes={"application/json"})
	public void register(@RequestBody  SignUpDetails signupSubmissionreq){
		
		
		signupSubmissionreq.toString();
		
		reistrSvc.registerClaim(signupSubmissionreq);
	}

}
