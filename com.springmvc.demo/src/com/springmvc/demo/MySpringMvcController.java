package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySpringMvcController {
	@RequestMapping("/")
	public String getMainMenu() {
		return "main-menu";
	}

}
