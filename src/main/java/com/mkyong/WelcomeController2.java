package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController2 {

	// inject via application.properties
	@Value("${welcome.message:test}")
	@RequestMapping("/")
	private String message = "for jenkins build 1";
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
	
		return "welcome";
	}

}
