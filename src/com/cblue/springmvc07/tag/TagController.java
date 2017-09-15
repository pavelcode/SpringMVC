package com.cblue.springmvc07.tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagController {
	
	
	@RequestMapping("tagUI.action")
	public String tag01(){
        System.out.println("TagController--tag01--");
		return "tag01";
	}
	
	@RequestMapping("tag.action")
	public String tag02(Person person,Model model){
        System.out.println("TagController--tag02--"+person);
		model.addAttribute("person", person);
		return "tag02";
	}

}
