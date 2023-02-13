package com.benocode.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.benocode.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {
		String expected = "Hello World!";
		
		String result = bs.getHelloWorld().toString();
		
		assertThat(result).isEqualTo(expected);
	}
}
