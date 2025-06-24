package com.Junit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JunitController {
	
	@GetMapping(value="/name")
	public String name() {
		return "sara";
	}

}
