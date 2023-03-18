package com.example.alubvaDeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class AlubvaDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value)-> System.out.println(key+" "+value)
		);
	}

}
