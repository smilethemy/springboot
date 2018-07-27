package com.ts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.ts.dao")
public class MicroappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroappApplication.class, args);
	}
}
