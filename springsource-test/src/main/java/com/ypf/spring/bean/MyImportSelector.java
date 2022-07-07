package com.ypf.spring.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: yanpengfan
 * @create: 2022-07-03 23:59
 **/
public class MyImportSelector  implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("狗狗叫"+Dog.class.getName());
		return new String[]{Dog.class.getName(),MyDog.class.getName()};
	}
}
