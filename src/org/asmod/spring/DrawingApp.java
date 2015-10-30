package org.asmod.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"spring.xml");
	Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
	triangle.draw();

    }

}
