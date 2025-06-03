package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.app.config.AppConfig;

public class App {
    public static void main(String[] args) {

    	
    	// ----------------Using XML approach-----------------------------
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");    // It will create the object
//    	Alien obj = context.getBean("alien", Alien.class);
//    //	obj.setAge(21);
//    	System.out.println(obj.getAge());
//    	obj.code();
//    	
//    	Computer com = context.getBean(Computer.class);
//    	
//    	Desktop obj1 = context.getBean(Desktop.class);
    	
    	
    	
    	// ----------------- Using Java based Config---------------------
    	// using this we did not required xml file just create AppConfig class.
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
//    	Desktop dt = context.getBean("com2",Desktop.class);    // we can also call it byName
//    	dt.compile();
    	
    	Desktop dt = context.getBean(Desktop.class);     // by default byName is your method name
    	dt.compile();
    	
    	Desktop dt1 = context.getBean(Desktop.class);
    	dt.compile();
    	
    	
    	Alien obj = context.getBean(Alien.class);
      	System.out.println(obj.getAge());
      	obj.code();
    	
    }
}
