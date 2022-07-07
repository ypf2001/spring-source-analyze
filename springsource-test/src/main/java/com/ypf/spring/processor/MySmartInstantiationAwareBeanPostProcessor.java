package com.ypf.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-04 20:43
 **/@Component
	public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	 public MySmartInstantiationAwareBeanPostProcessor(){
		 System.out.println("MySmartInstantiationAwareBeanPostProcessor");
	 }
		//预测bean类型最后一次改变组件类型
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor predictBeanType");
		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override//返回早期的bean引用
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("getEarlyBeanReference");
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}
}
