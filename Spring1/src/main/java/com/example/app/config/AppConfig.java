package com.example.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.app.Alien;
import com.example.app.Computer;
import com.example.app.Desktop;
import com.example.app.Laptop;

@Configuration
@ComponentScan("com.example.app")
public class AppConfig {

//	@Bean(name="com2")
//	public Desktop desktop() {
//		return new Desktop();  }
	
	
	//   @Bean(name = {"com2", "desktop1", "Beast"})
//	public Desktop desktop() {
//		return new Desktop();   }
		
//	@Bean
//	@Scope("prototype")  // if you want to create object two times then use scope as a prototype
//	public Desktop desktop() {
//		return new Desktop();
//	
//	}
//	
//	@Bean
//	public Alien alien( Computer com) {               // @Qualifier("desktop")
//		Alien obj = new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		
//		return obj;
//		
//	}
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//		
//	}
	
	
}
