package com.example.demohost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class DemohostApplication {
	@RequestMapping("/")
	@ResponseBody
	String firstPage() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemohostApplication.class, args);
	}

}
