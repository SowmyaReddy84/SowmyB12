package com.niit.coolcodersbackend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class Blog_Master {
@Id
@GeneratedValue
private int bid;
private String btitle;
private String bdesc;
@Transient
private MultipartFile bimg;
private Date bpstdate;
private String buser;
private String bdeta;
private int bcmnt;
private int blike;


public Blog_Master() {
	
}
public Blog_Master(String btitle, String bdesc, Date bpstdate, String buser, String bdeta,
		int bcmnt, int blike) {
	
	
	this.btitle = btitle;
	this.bdesc = bdesc;
	this.bpstdate = bpstdate;
	this.buser = buser;
	this.bdeta = bdeta;
	this.bcmnt = bcmnt;
	this.blike = blike;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBtitle() {
	return btitle;
}
public void setBtitle(String btitle) {
	this.btitle = btitle;
}
public String getBdesc() {
	return bdesc;
}
public void setBdesc(String bdesc) {
	this.bdesc = bdesc;
}
public MultipartFile getBimg() {
	return bimg;
}
public void setBimg(MultipartFile bimg) {
	this.bimg = bimg;
}
public Date getBpstdate() {
	return bpstdate;
}
public void setBpstdate(Date bpstdate) {
	this.bpstdate = bpstdate;
}
public String getBuser() {
	return buser;
}
public void setBuser(String buser) {
	this.buser = buser;
}
public String getBdeta() {
	return bdeta;
}
public void setBdata(String bdeta) {
	this.bdeta = bdeta;
}
public int getBcmnt() {
	return bcmnt;
}
public void setBcmnt(int bcmnt) {
	this.bcmnt = bcmnt;
}
public int getBlike() {
	return blike;
}
public void setBlike(int blike) {
	this.blike = blike;
}




}
