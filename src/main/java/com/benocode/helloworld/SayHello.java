package com.benocode.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.benocode.helloworld.model.HelloWorld;
import com.benocode.helloworld.service.BusinessService;

@Component
public class SayHello implements CommandLineRunner {

	@Autowired
	private BusinessService bs;
	
	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}
}