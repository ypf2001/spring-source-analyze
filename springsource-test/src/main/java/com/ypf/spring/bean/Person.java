package com.ypf.spring.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 15:30
 **/
@Component
public class Person {
	private String name;
	@Autowired
	private  Cat cat;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	//bean定义中心注册中心 图纸中心

}
