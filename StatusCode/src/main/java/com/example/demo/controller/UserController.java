package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/get")
	public ResponseEntity<String> getMethod(){
    	
    	ResponseEntity<String> res= new ResponseEntity<String>("Hello...",HttpStatus.OK);
		return res;
		
	}
}
