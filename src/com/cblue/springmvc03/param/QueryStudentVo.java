package com.cblue.springmvc03.param;

import java.util.List;
import java.util.Map;

public class QueryStudentVo {

	private List<Student> studentList;
	
	private Map<String,Student> studentMap;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Map<String, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<String, Student> studentMap) {
		this.studentMap = studentMap;
	}

	
	
	
}
