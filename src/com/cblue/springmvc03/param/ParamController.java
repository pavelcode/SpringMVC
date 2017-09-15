package com.cblue.springmvc03.param;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ParamController {
	
	//以简单数据类型为方法参数
	@RequestMapping("/simpleParam")
	public void simpleParam(int id){
		System.out.println("simpleParam");
		System.out.println("id="+id);
		
	}
	
	//使用@RequestParam("id")设定url参数和方法参数的对应关系
	@RequestMapping("/annotationParam")
	public void simpleAnnotationParam(@RequestParam(value="id",required=true,defaultValue="100") int produtid){
		System.out.println("simpleAnnotationParam");
		System.out.println("produtid="+produtid);
		
	}
	
	//以默认对象为方法参数
	@RequestMapping("/objectParam")
	public void objectParam(HttpServletRequest request){
		System.out.println("objectParam");
		System.out.println("id="+request.getParameter("id"));
	}
	
	//以pojo对象为参数
	@RequestMapping("/pojoParam")
	public void pojoParam(Student student){
		System.out.println("pojoParam");
		System.out.println(student);
	}
	
	//list集合参数
	@RequestMapping("/listParam")
	public void listParam(QueryStudentVo queryStudentVo){
		System.out.println("listParam");
		System.out.println(queryStudentVo.getStudentList());
	}
	
	@RequestMapping("/mapParam")
	public void mapParam(QueryStudentVo queryStudentVo){
		System.out.println("mapParam");
		System.out.println(queryStudentVo.getStudentMap());
	}
	
	
	

}
