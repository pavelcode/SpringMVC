package com.cblue.springmvc03.param;

public class Student {
	
	private String stuname;
	private String stupass;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStupass() {
		return stupass;
	}
	public void setStupass(String stupass) {
		this.stupass = stupass;
	}
	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stupass=" + stupass + "]";
	}
	
	
	

}
