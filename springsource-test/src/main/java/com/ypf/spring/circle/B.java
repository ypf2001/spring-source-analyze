package com.ypf.spring.circle;

import com.ypf.spring.circle.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-07 14:50
 **/
@Component
public class B {
	private A a;

	public A getA() {
		return a;
	}
	@Autowired
	public void setA(A a) {
		System.out.println("a被赋值");
		this.a = a;
	}
}
