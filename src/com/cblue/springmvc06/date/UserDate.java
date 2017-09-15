package com.cblue.springmvc06.date;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDate {

	private String name;
	private Date createdate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", createdate=" + createdate + "]";
	}
	
	
}
