package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者 :tinko
 * @version 创建时间：2019年04月10日 下午8:10:59 说明:{ }
 */
@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(String name) {
		return "Hello " + name + ",From port:" + port;
	}

}
