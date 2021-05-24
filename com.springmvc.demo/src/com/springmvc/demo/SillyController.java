package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SillyController {

	@RequestMapping("/showform")
	public String showForm() {
		return "form-show";
	}
}
