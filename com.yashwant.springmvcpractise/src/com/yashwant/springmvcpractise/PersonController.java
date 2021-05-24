package com.yashwant.springmvcpractise;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/family")
public class PersonController {

	@RequestMapping("/showform")
	public String showForm(Model model) {
		Person per = new Person();
		model.addAttribute("person", per);
		return "family-details";
	}

	@RequestMapping("/processform")
	public String processDetails(@Valid@ModelAttribute("person") Person person ,BindingResult bindingResult) {
//System.out.println("The Family Detials are :" +person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" "+person.getRelation());
		return bindingResult.hasErrors()?"main-page":"show-family-details";
		

	}

}
