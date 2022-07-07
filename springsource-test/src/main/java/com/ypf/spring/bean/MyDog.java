package com.ypf.spring.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-04 15:59
 **/

public class MyDog implements InitializingBean, ApplicationContextAware, MessageSourceAware {
	String name;
	ApplicationContext context;
	MessageSource messageSource;
Dog dog;
	public String getName() {
		return name;
	}

	public Dog getDog() {
		return dog;
	}
	@Autowired
	public void setDog(Dog dog) {
	System.out.println("调用");
		this.dog = dog;
	}
	public void setName(String name) {
		System.out.println("方法调用");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat -- afterPropertiesSet--");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("获得ioc容器");
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
