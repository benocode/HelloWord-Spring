package com.benocode.helloworld.service;

import org.springframework.stereotype.Component;

import com.benocode.helloworld.model.HelloWorld;

@Component
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		return helloWorld;
	}

}
