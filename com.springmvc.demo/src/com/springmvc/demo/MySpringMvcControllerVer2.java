package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MySpringMvcControllerVer2 {

	
	@RequestMapping("/showform")
	public String showForm() {
		return "form-show";
	}
	
	@RequestMapping("/processform")
	public String processForm() {
		return "form-detail";
	}
	@RequestMapping("/processformVer2")
	public String showDetails(HttpServletRequest request,Model model) {
		String name = request.getParameter("studentName");
		name=name.toUpperCase();
		String message="YO YO ! "+name;
		model.addAttribute("message",message);
		return "form-detail";
	}
	
	@RequestMapping("/processformVer3")
	public String getTheRequestParam(@RequestParam("studentName") String name,Model model) {
//		String name = request.getParameter("studentName");
		name=name.toUpperCase();
		String message="YO YO ! "+name;
		model.addAttribute("message",message);
		return "form-detail";
	}
	
}
