package com.lad_corp.ingym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InGymApplication {

	public static void main(String[] args) {
		SpringApplication.run(InGymApplication.class, args);
	}
	
	@CrossOrigin
	@RequestMapping("/status")
	public ResponseEntity<String> home() {
		return new ResponseEntity<>("Status: OK" , HttpStatus.OK);
	}

}
