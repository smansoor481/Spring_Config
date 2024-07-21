package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.telusko.config.AppConfig;

/*
 * Hello world
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Alian obj = (Alian) context.getBean("alian",Alian.class);
		
		System.out.println(obj.getAge());
		obj.code();
		
		
//		Desktop dt = context.getBean("desktop",Desktop.class);
//		dt.compile();
//		
//		Desktop dt1 = context.getBean("desktop",Desktop.class);
//		dt.compile();
//		Hello h = context.getBean(Hello.class);
//		h.Hello();
					
					
		
		
		
		
		
		
		
		
		
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*
		 * Application context is a container, 
		 * in this both bean factory and some additional features.
		 * 
		 * In Application Context, how many beans are created those many objects are created.
		 */
//		Alian obj = (Alian) context.getBean("alian",Alian.class);
//		obj.code();
////		obj.setAge(21);
//		System.out.println(obj.getAge());
////		System.out.println(obj.getName());
		
		
		
//		Desktop obj1 = (Desktop) context.getBean(Desktop.class);
//		Laptop obj2 = (Laptop) context.getBean(Laptop.class);
		
		
		
	}

}
