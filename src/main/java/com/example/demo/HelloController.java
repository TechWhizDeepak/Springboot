package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "Hi...";
	}

	@RequestMapping("/DPK")
	public String DPK() {
		return "Hello Deepak Chugh";
	}

	@RequestMapping("/JMD")
	public String JMD() {
		return "Jai Mata Di";
	}

}
