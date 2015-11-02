package org.asmod.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

	AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"spring.xml");
	// Enable DisposableBean
	applicationContext.registerShutdownHook();
	Triangle triangle = (Triangle) applicationContext.getBean("triangle");
	triangle.draw();

    }

}
