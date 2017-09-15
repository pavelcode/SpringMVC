package com.cblue.springmvc09.validate;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class Student {
	
	@Length(min=5, max=20, message="用户名长度必须在5-20之间")  
	private String name;
	
	@Range(min=1,max=99,message="年龄必须是1到99之间")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
