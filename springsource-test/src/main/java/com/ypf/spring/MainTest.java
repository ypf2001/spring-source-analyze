package com.ypf.spring;

import com.ypf.spring.bean.Cat;
import com.ypf.spring.bean.HelloFactory;
import com.ypf.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 15:17
 **/
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cat bean = context.getBean(Cat.class);
		System.out.println(bean.getName());
	}
	public static void test01(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		HelloFactory bean1 = context.getBean(HelloFactory.class);
		System.out.println(bean1.getClass().getTypeName());
		System.out.println(bean);
		System.out.println("hello world");

	}
}
