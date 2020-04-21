package com.example.demo.jsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class DemoJspApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoJspApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}

	@ModelAttribute
	public SampleForm sampleForm() {
		SampleForm sampleForm = new SampleForm();
		return sampleForm;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/post")
	public String post(@ModelAttribute SampleForm sampleForm) {
		logger.info("SampleForm.inputA : {}", sampleForm.getInputA());
		logger.info("SampleForm.inputB : {}", sampleForm.getInputB());
		return "post";
	}
}
