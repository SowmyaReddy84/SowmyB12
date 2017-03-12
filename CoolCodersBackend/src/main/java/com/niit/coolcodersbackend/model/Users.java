package com.niit.coolcodersbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Users {
	@Id
	private int id;
	private String loginid;
	private String usrname;
	private String usrpwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getUsrpwd() {
		return usrpwd;
	}
	public void setUsrpwd(String usrpwd) {
		this.usrpwd = usrpwd;
	}
	
	

}
