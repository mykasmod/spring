package org.asmod.spring;

import java.util.List;

public class Triangle {

    private List<Point> points;

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

    /*
     * @Override public void afterPropertiesSet() throws Exception { System.out
     * .println("InitializingBean afterPropertiesSet method for Triangle!"); }
     * 
     * @Override public void destroy() throws Exception {
     * System.out.println("DisposableBean destroy method for Triangle!"); }
     */
    public void myInit() {
	System.out.println("myInit called for Triangle");
    }

}
