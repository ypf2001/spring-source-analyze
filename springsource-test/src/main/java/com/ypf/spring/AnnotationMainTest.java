package com.ypf.spring;

import com.ypf.spring.bean.person;
import com.ypf.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 20:52
 **/
public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		person bean = context.getBean(person.class);
		System.out.println(bean);
	}
}
