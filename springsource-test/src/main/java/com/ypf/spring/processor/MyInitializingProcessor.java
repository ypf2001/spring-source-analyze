package com.ypf.spring.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-04 20:42
 **/@Component
public class MyInitializingProcessor implements InitializingBean {
	public MyInitializingProcessor(){
		System.out.println("MyInitializingProcessor ==========");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet==========");
	}
}
