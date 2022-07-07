package com.ypf.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 23:41
 **/

@Component
//@Scope(scopeName = "prototype")
public class Cat {
	private String name;
public Cat(){
	System.out.println("hello world");
}
	public String getName() {
		return name;
	}
	@Value("${JAVA_HOME}")

	public void setName(String name) {
		System.out.println("正在复制调用");
		this.name = name;
	}
}
