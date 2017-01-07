package com.lm.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lm.hackathon.controller.model.SignUpDetails;

@SuppressWarnings( "restrictions" )
@Repository("registerDAOObj")
public class RegistrationDAO {
	
	
	@Autowired
	public DataSource dataSource;

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

	
	
	public Boolean registerNewUser(SignUpDetails signUpsubmissionReq){
		
		Boolean registration = null;
		String qry = null;

		 qry = "insert into registration(PHONE_NUMBER,FNAME,LNAME,EMAIL) values (?,?,?,?)";
	
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(qry);
			
			
			ps.setString(2,signUpsubmissionReq.getFirstName());
			ps.setString(3,signUpsubmissionReq.getLastName());
			ps.setString(1,signUpsubmissionReq.getTelephone());
			ps.setString(4,signUpsubmissionReq.getEmail());
			
			registration = ps.execute();
			
			
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
		return registration;
	}
}
	
	
