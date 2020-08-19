package com.pipimovie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.pipimovie"} )
@MapperScan("com.pipimovie.dao")

@RestController
public class PipiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipiApplication.class, args);

	}

	@GetMapping("/")
	public String home(){
		return "hello world";
	}
}
