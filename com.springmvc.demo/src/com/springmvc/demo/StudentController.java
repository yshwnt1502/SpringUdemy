package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		Student student=new Student();
		theModel.addAttribute("student",student); 	
		return "student-form";
	}
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student thestudent) {
		System.out.println("Student First Name :"+thestudent.getFirstName());
		System.out.println("Student Last Name :"+thestudent.getLastName());
		return "student-confirmation";
	}
	
}
