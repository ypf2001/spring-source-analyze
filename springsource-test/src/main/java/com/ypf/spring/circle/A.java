package com.ypf.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-07 14:50
 **/
@Component
public class A {
	private B b;
	private A a;

	public B getB() {
		return b;
	}
	@Autowired
	public void setB(B b) {
		System.out.println("b被赋值");
		this.b = b;
	}

	public A getA() {
		return a;
	}
	@Autowired
	public void setA(A a) {
		this.a = a;
	}
}
