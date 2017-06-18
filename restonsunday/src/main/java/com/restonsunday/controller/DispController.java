package com.restonsunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispController {
	@RequestMapping("/")
	public String displayIndex()
	{
		return  "index";
	}

}
