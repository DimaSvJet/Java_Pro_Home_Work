package com.example.home_work_8.geometry;

public class Circle implements Geometry {

    final static double pi = Math.PI;
    private int circleS;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.circleS = figuraArea(radius, 0);
    }

    @Override
    public int figuraArea(int radius, int height) {
        int figurS = (int) pi * radius^2;
        System.out.println("S circle: "+figurS);
        return figurS;

    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getFigureS() {
        return circleS;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCircleS() {
        return circleS;
    }
}

