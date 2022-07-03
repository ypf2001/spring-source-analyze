package com.ypf.spring;

import com.ypf.spring.bean.person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 15:17
 **/
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		person bean = context.getBean(person.class);
		System.out.println(bean);
//		System.out.println("hello world");
	}
}
