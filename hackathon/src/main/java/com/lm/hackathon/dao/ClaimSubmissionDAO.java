package com.lm.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lm.hackathon.controller.model.ClaimSubmissionReq;

@SuppressWarnings("restriction")
@Repository("claimSubDAOObj")
public class ClaimSubmissionDAO {

	@Autowired
	public DataSource dataSource;
	
	private JavaMailService javaMailSvc;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@PostConstruct
	private void initialize(){
		
		setDataSource(dataSource);
	}

	public Boolean createClaimDAO(ClaimSubmissionReq claimSubreq) {
		
		Boolean claimPersisted = null;
		String qry = null;

		 qry = "insert into claim_info(CLAIMID,POLICYID,DOL,PHONE_NUMBER,FNAME,LNAME,MAKE,VEHICLE_MODEL) values (?,?,?,?,?,?,?,?)";
	
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(qry);
			ps.setInt(1, 1);
			ps.setString(2,claimSubreq.getPolicyDetails().getPolicyNumber());
			ps.setString(3,claimSubreq.getPolicyDetails().getLossDate());
			ps.setString(4,claimSubreq.getPolicyDetails().getTelephone());
			ps.setString(5,claimSubreq.getClaimSubmission().getFirstName());
			ps.setString(6,claimSubreq.getClaimSubmission().getLastName());
			ps.setString(7,claimSubreq.getClaimSubmission().getMake());
			ps.setString(8,claimSubreq.getClaimSubmission().getModel());
			
			claimPersisted = ps.execute();
			
			javaMailSvc = new JavaMailService();
			
			javaMailSvc.sendMail(claimSubreq.getClaimSubmission().getEmail());
			
	}catch (SQLException e) {
		e.printStackTrace();
	} finally {

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

System.out.println(claimPersisted);
return claimPersisted;
}

}
