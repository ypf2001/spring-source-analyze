package com.ypf.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-04 20:41
 **/@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
public MyBeanDefinitionRegistryPostProcessor(){
	System.out.println("MyBeanDefinitionRegistryPostProcessor");
}
	@Override//后执行
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory=========");
	}

	@Override//先执行
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
	//增强bean定义信息的注册中心
		System.out.println("postProcessBeanFactory=========");
	}
}
