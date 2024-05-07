package com.example.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class JenkinsApplication {
	static Logger logger= (Logger) LoggerFactory.getLogger(JenkinsApplication.class);
    @GetMapping("/")
	public String home(){
		return"Welcome ";
	}

	@PostConstruct
			public void init(){
logger.info("Application started.....");
	}
	public static void main(String[] args) {
		logger.info("Application executed.....");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
