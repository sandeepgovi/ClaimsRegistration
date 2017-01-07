package com.lm.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.hackathon.controller.model.ClaimSubmissionReq;
import com.lm.hackathon.service.ClaimSubmissionService;

@RestController
public class ClaimController {
	

	private ClaimSubmissionService claimSubSvc;

	@Autowired
	public ClaimController(ClaimSubmissionService claimSubSvc) {
		super();
		this.claimSubSvc = claimSubSvc;
	}

	@RequestMapping(value="/submitClaim.htm",method=RequestMethod.POST ,consumes={"application/json"})
	public void submitClaim(@RequestBody ClaimSubmissionReq claimSubReq ){
		
		
		claimSubSvc.createClaim(claimSubReq);
		
		System.out.println(claimSubReq.toString());
		
		

}

	
}
