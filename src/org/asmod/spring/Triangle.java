package org.asmod.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext applicationContext = null;

    public void draw() {
	System.out.println("Triangle Drawn using autowire=byName");
	System.out.println("pointA.getX() + pointA.getY() = " + pointA.getX()
		+ ", " + pointA.getY());
	System.out.println("pointB.getX() + pointB.getY() = " + pointB.getX()
		+ ", " + pointB.getY());
	System.out.println("pointC.getX() + pointC.getY() = " + pointC.getX()
		+ ", " + pointC.getY());

	// Uses ApplicationContextAware interface
	Point newPointA = (Point) applicationContext.getBean("pointA");

	if (!newPointA.equals(pointA)) {
	    System.out
		    .println("\nSample of pointA bean with scope=prototype. \"newPointA\" is a new instance!");
	    System.out.println("newPointA.hashCode() = " + newPointA.hashCode()
		    + " COMPARED TO pointA.hashCode() = " + pointA.hashCode());
	}

    }

    public Point getPointA() {
	return pointA;
    }

    public void setPointA(Point pointA) {
	this.pointA = pointA;
    }

    public Point getPointB() {
	return pointB;
    }

    public void setPointB(Point pointB) {
	this.pointB = pointB;
    }

    public Point getPointC() {
	return pointC;
    }

    public void setPointC(Point pointC) {
	this.pointC = pointC;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
	    throws BeansException {
	this.applicationContext = applicationContext;

    }

    @Override
    public void setBeanName(String name) {
	System.out.println("Bean Name is: " + name);

    }

}
