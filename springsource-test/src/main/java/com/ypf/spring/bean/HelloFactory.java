package com.ypf.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-04 17:32
 **/
//给容器中注册的不是hellofactory 而是HelloFactory 调用了getObject 返回的对象 类似是getobjecttype\
public class HelloFactory implements FactoryBean<Object> {
	public HelloFactory(){
		System.out.println("helloFactory ");
	}
	@Override
	public Object getObject() throws Exception {
		return new Object();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
