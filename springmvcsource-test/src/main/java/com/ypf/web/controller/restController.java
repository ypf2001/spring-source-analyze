package com.ypf.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-07 17:28
 **/
@RestController
public class restController {
	@RequestMapping("/hello")
	public String sayHello(){
		return  "Hello,springMVC";
	}
}
