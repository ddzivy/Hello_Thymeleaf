package com.example.e1c2_dzivy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String greeting(@RequestParam(value="name")String name, @RequestParam(value="age")Integer age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}
