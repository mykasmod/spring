package org.asmod.spring;

public class Triangle {
    private String type;
    private int height;

    public Triangle(String type, int height) {
	this.type = type;
	this.height = height;
    }

    public void draw() {
	System.out.println("Triangle Drawn!");
    }

    public String getType() {
	return type;
    }

    public int getHeight() {
	return height;
    }

}
