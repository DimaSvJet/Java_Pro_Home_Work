package com.example.home_work_8.geometry;

public class Triangle implements Geometry {

    private int height;
    private int width;
    int triangleS;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.triangleS = figuraArea(height,width);

    }
    @Override
    public int figuraArea(int height, int width) {
        int figurS = (height*width)/2;
        System.out.println("S triangle: " + figurS);
        return figurS;
    }

    @Override
    public int getFigureS() {
        return triangleS;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
