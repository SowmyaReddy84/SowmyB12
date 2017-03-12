package com.niit.coolcodersbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Friend {
@Id
private int frndid;
private int usrid;
private String status;
private char isOnline;



public int getFrndid() {
	return frndid;
}
public void setFrndid(int frndid) {
	this.frndid = frndid;
}
public int getUsrid() {
	return usrid;
}
public void setUsrid(int usrid) {
	this.usrid = usrid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public char getIsOnline() {
	return isOnline;
}
public void setIsOnline(char isOnline) {
	this.isOnline = isOnline;
}
}
