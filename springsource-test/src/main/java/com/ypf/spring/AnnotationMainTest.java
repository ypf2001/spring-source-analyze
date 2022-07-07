package com.ypf.spring;

import com.ypf.spring.bean.Cat;
import com.ypf.spring.bean.Person;
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
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean);
//		String[] names = context.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}
//		Cat bean1 = context.getBean(Cat.class);
//		Cat bean2 = context.getBean(Cat.class);
//		System.out.println(bean1==bean2);
//		Person bean1 = context.getBean(Person.class);
//		Person bean2 = context.getBean(Person.class);
//		System.out.println(bean1.getCat()==bean2.getCat());
		Cat bean = context.getBean(Cat.class);
		System.out.println(bean.getName());

	}
}
