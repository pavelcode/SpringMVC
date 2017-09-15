package com.cblue.springmvc08.upload;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping("uploadUI")
	public String uploadUI(){
		System.out.println("UploadController--uploadUI");
		return "upload";
	}
	
	@RequestMapping("upload")
	public String upload(String name,HttpServletRequest request,@RequestParam(required=true)MultipartFile uploadFile,Model model){
		System.out.println("UploadController--upload--"+name);
		//得到要保存的路径
		String saveDic = request.getSession().getServletContext().getRealPath("/images/");
		System.out.println("saveDic="+saveDic);
		//得到文件名
		String fileName = uploadFile.getOriginalFilename();
		System.out.println("fileName="+fileName);
		try {
			if (saveDic != null) {
				   File filetemp = new File(saveDic);
				   if (!filetemp.exists()) {
				    //建立文件夹
				         filetemp.mkdirs();
				   }
				 //上传文件
				   uploadFile.transferTo(new File(saveDic, fileName));
			}
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		model.addAttribute("imgurl","images/"+fileName);
		return "upload";
	}

}
