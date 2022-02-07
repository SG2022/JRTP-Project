package com.springhibernate.addEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AddEmployeeApplication {
	/*@GetMapping("/welcome")
	public String welcome()
	{
		return("hello customer");
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AddEmployeeApplication.class, args);
	}

}
