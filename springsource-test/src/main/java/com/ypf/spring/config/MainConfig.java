package com.ypf.spring.config;

import com.ypf.spring.bean.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 20:55
 **/
@Import({Person.class, MainConfig.IportRegister.class, MyImportSelector.class})
@ComponentScan("com.ypf.spring")
@Configuration
public class MainConfig {
//	@Bean
//	public person person(){
//		person person = new person();
//		person.setName("李四");
//		return person;
//	}
static class IportRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		//class type name
		//让spring使用自己创建的实列 而不是spring自己实例化
//		beanDefinition.setInstanceSupplier(()->new HelloFactory());
		beanDefinition.setBeanClass(HelloFactory.class);
		System.out.println("注入");
		registry.registerBeanDefinition("HelloFactory",beanDefinition );
	}
}
}
