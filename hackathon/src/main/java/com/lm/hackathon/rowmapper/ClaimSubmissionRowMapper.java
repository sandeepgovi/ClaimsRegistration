package com.lm.hackathon.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lm.hackathon.controller.model.ClaimSubmissionReq;

public class ClaimSubmissionRowMapper  implements RowMapper<ClaimSubmissionReq>{

	@Override
	public ClaimSubmissionReq mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ClaimSubmissionReq calimSubreq = new ClaimSubmissionReq();
		
		calimSubreq.getPolicyDetails().setPolicyNumber(rs.getString("POLICYID"));
		calimSubreq.getPolicyDetails().setLossDate(rs.getString("DOL"));
		calimSubreq.getPolicyDetails().setTelephone(rs.getString("PHONE_NUMBER"));
		calimSubreq.getClaimSubmission().setFirstName(rs.getString("FNAME"));
		calimSubreq.getClaimSubmission().setLastName(rs.getString("LNAME"));
		calimSubreq.getClaimSubmission().setMake(rs.getString("MAKE"));
		calimSubreq.getClaimSubmission().setModel(rs.getString("VEHICLE_MODEL"));
		
		return calimSubreq;
	}

}
