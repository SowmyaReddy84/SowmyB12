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
public class Forum_Master 
{
	@Id
	@GeneratedValue
	private int fid;
	private String ftitle;
	private String fdy;
	@Transient
	private MultipartFile fimg;
	private Date fpstdate;
	private String fuser;
	private String fsec;
	private int fcmnt;
	private int flike;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public String getFdy() {
		return fdy;
	}
	public void setFdy(String fdy) {
		this.fdy = fdy;
	}
	public MultipartFile getFimg() {
		return fimg;
	}
	public void setFimg(MultipartFile fimg) {
		this.fimg = fimg;
	}
	
	public String getFsec() {
		return fsec;
	}
	public void setFsec(String fsec) {
		this.fsec = fsec;
	}
	public Date getFpstdate() {
		return fpstdate;
	}
	public void setFpstdate(Date fpstdate) {
		this.fpstdate = fpstdate;
	}
	public String getFuser() {
		return fuser;
	}
	public void setFuser(String fuser) {
		this.fuser = fuser;
	}
	public int getFcmnt() {
		return fcmnt;
	}
	public void setFcmnt(int fcmnt) {
		this.fcmnt = fcmnt;
	}
	public int getFlike() {
		return flike;
	}
	public void setFlike(int flike) {
		this.flike = flike;
	}
	

}
