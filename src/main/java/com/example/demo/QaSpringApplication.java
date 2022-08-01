package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class QaSpringApplication {

	public static void main(String[] args) {
		
	    ApplicationContext context = SpringApplication.run(QaSpringApplication.class, args);

	    Object byName = context.getBean("greeting", "farewell");
	    //String byType = context.getBean(String.class);
	    String byBoth = context.getBean("farewell", String.class);

	    System.out.println(byName);
	    //System.out.println(byType);
	    System.out.println(byBoth);
	}
	
	

}
