package com.ypf.web;

import com.ypf.web.config.AppConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-07 17:00
 *
 * tomcat一启动就会加载他
 * 	 1.创建了容器
 * 	 2.注册一个servlet DispatcherServlet
 * 	 效果 访问tomcat 部署的这个web引用下	的所有请求都会被DispatcherServlet处理
 * 	 DispatcherServlet会将进入mvc的流程
 *
 **/
public class AppStarter implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
//以上ioc容器都没有启动
		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}
}
