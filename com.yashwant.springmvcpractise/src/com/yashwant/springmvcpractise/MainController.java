package com.yashwant.springmvcpractise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getMainPage() {
		return "main-page";
	}

}
