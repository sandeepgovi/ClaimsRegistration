package com.lm.hackathon.controller.model;

public class ClaimSubmissionReq {
	
	private PolicyDetails policyDetails;
	private ClaimSubmission claimSubmission;
	
	public PolicyDetails getPolicyDetails() {
		return policyDetails;
	}
	public void setPolicyDetails(PolicyDetails policyDetails) {
		this.policyDetails = policyDetails;
	}
	public ClaimSubmission getClaimSubmission() {
		return claimSubmission;
	}
	public void setClaimSubmission(ClaimSubmission claimSubmission) {
		this.claimSubmission = claimSubmission;
	}
	@Override
	public String toString() {
		return "ClaimSubmissionReq [policyDetails=" + policyDetails + ", claimSubmission=" + claimSubmission + "]";
	}

	
	
}
