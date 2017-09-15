package com.cblue.springmvc09.validate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ValidateController {
	
	@RequestMapping("validateUI")
	public ModelAndView valiateUI(){
		System.out.println("ValidateController--valiateUI");
		Student student = new Student();
		return new ModelAndView("validate").addObject(student);
	}

	@RequestMapping("validate")
	public String valiate(@Valid @ModelAttribute("student") Student student,BindingResult br){
		System.out.println("ValidateController--valiate--"+br.hasErrors());
		if(br.hasErrors()){
			return "validate";
		}else{
			return "success";
		}
	}

}
