package com.practice.Test1.controller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Test1.service1.Service1;

@RestController
@RequestMapping("/data")
public class Controller1 {
	
	@Autowired
	Service1 service1;

	@GetMapping("/data9")
	public String add9() {
		
	return service1.add9();
		
	}
	//public String now() {
		
		//return service1.now("string", 2);
	//}
}

