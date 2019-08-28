package com.tw.apistackbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiStackBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStackBaseApplication.class, args);
		System.out.println("火箭即将发射，请各单位做好准备！");
	}
}
