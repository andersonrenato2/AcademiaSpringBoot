package controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@SpringBootApplication
public class UserController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

}
