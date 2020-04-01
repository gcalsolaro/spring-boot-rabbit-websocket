package com.gcalsolaro.rabbit.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/rabbit")
public class HomeController {

	@GetMapping
	public String index(Model model) {
		return "index";
	}

}
