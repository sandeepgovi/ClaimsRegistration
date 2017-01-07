package com.lm.hackathon.controller.model;

public class PolicyDetails {

	private String policyNumber;
	private String telephone;
	private String lossDate;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLossDate() {
		return lossDate;
	}
	public void setLossDate(String lossDate) {
		this.lossDate = lossDate;
	}
	
	@Override
	public String toString() {
		return "PolicyDetails [policyNumber=" + policyNumber + ", telephone=" + telephone + ", lossDate=" + lossDate
				+ "]";
	}
	
	
}
