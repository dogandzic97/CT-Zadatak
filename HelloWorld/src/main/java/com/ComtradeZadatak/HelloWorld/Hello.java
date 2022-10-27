package com.ComtradeZadatak.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello {
	
	
	
	
	
	@GetMapping("/helo")
	 public String HelloWorld(){	 
		 return "Hello-World";
	 }

	@GetMapping("/hello-rest")
	 public String HelloRest() {
		 return "Hello_Rest";
	 }

}
