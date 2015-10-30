package org.asmod.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {

    private List<Point> points;
    private Point pointB;

    private ApplicationContext applicationContext = null;

    public void draw() {

	for (Point point : points) {
	    System.out.println("point.getX , point.getY() = " + point.getX()
		    + ", " + point.getY());
	}

    }

    public List<Point> getPoints() {
	return points;
    }

    public void setPoints(List<Point> points) {
	this.points = points;
    }

    public Point getPointB() {
	return pointB;
    }

    public void setPointB(Point pointB) {
	this.pointB = pointB;
    }

}
