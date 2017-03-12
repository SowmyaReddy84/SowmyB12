package com.niit.coolcodersbackend.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Forum_Response {
@Id
private int rid;
private int fid;
private String rpl;
private String fuser;
private String floginid;
private Date rdate;
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getRpl() {
	return rpl;
}
public void setRpl(String rpl) {
	this.rpl = rpl;
}
public String getFuser() {
	return fuser;
}
public void setFuser(String fuser) {
	this.fuser = fuser;
}
public String getFloginid() {
	return floginid;
}
public void setFloginid(String floginid) {
	this.floginid = floginid;
}
public Date getRdate() {
	return rdate;
}
public void setRdate(Date rdate) {
	this.rdate = rdate;
}
}