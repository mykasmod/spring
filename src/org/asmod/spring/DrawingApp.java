package org.asmod.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {
	// This sample uses a normal instantiation
	/*
	 * Triangle triangle = new Triangle(); triangle.draw();
	 */
	BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
		"spring.xml"));
	Triangle triangle = (Triangle) factory.getBean("triangle");
	triangle.draw();

    }

}
