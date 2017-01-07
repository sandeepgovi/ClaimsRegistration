package com.lm.hackathon.service;

import org.springframework.stereotype.Service;

import com.lm.hackathon.controller.model.ClaimSubmissionReq;
import com.lm.hackathon.dao.ClaimSubmissionDAO;

@Service("claimSubSvc")
public class ClaimSubmissionService {
	
	
	private ClaimSubmissionDAO claimSubDAOObj;
	


	public ClaimSubmissionDAO getClaimSubDAOObj() {
		return claimSubDAOObj;
	}



	public void setClaimSubDAOObj(ClaimSubmissionDAO claimSubDAOObj) {
		this.claimSubDAOObj = claimSubDAOObj;
	}



	public Boolean createClaim(ClaimSubmissionReq clamSubreq){
		
		
		return claimSubDAOObj.createClaimDAO(clamSubreq);
		
	}

	

}
