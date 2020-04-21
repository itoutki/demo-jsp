package com.example.demo.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}


	@GetMapping("/")
	public String index() {
		return "index";
	}
}
