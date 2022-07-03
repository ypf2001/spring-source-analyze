package com.ypf.spring.config;

import com.ypf.spring.bean.person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 20:55
 **/
@Configuration
public class MainConfig {
	@Bean
	public person person(){
		person person = new person();
		person.setName("李四");
		return person;
	}
}
