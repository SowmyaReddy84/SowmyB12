package com.niit.coolcodersbackend.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Blog_Comment {

	@Id
	
	private int cid;
	private int bid;
	private String cmnt;
	private String buser;
	private long cdate;
	
	public long getCdate() {
		return cdate;
	}


	public void setCdate(long cdate) {
		this.cdate = cdate;
	}


	public Blog_Comment() {
		
	}


	public Blog_Comment(int cid, int bid, String cmnt, String buser, long cdate) {
		
		this.cid = cid;
		this.bid = bid;
		this.cmnt = cmnt;
		this.buser = buser;
		this.cdate = cdate;
	}
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getCmnt() {
		return cmnt;
	}

	public void setCmnt(String cmnt) {
		this.cmnt = cmnt;
	}

	public String getBuser() {
		return buser;
	}

	public void setBuser(String buser) {
		this.buser = buser;
	}



	
}
