package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 作者 :码家学院 讲师 廖祥 qq:438944209
 * @version 创建时间：2017年12月31日 下午8:11:44 说明:{ }
 */
@SpringBootApplication
@EnableEurekaClient
public class HelloApp {
	public static void main(String[] args) {

		SpringApplication.run(HelloApp.class, args);
	}
}
