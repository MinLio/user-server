package com.luxigu.userserver.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxigu.userserver.service.ILicenceService;

@ControllerAdvice
@RestController
@RequestMapping(value = "/{suerId}/v1/{username}")
public class UserController {
	
	private ILicenceService licenceService;
	
	@GetMapping(value = "hello")
	public String sayHello(@PathVariable(name = "username") String userName) {
		
		return "hello " + userName;
	}

	@GetMapping(value = "checknull")
	public String checkNull(String checkId) {
		licenceService.checkNotNull(null);
		return "check";
	}
}
