package com.rab3tech;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	@Autowired
	private DataSource dataSource;
	
	public boolean validateUser(String username, String password) {
		boolean status=false;
		String sql = "select username from user_logins_tbl where username=? and password=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<String> users = jdbcTemplate.queryForList(sql,new Object [] {username,password}, String.class);
		if(users.size()==0) {
			status = false;
		}
		else {
			status = true;
		}
		
		return status;
		
	}
}
