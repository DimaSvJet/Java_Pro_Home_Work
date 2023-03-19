package com.example.home_work_8.geometry;

public class Circle implements Geometry {

    final static double pi = Math.PI;
    final private int height = 0;
    final private int width = 0;
    private static int totalS;
    private static int figurS;
    int circleS;

    private int radius;



    public Circle(int radius) {
        this.radius = radius;
        this.circleS = figuraArea(radius);
    }

    @Override
    public int figuraArea(int height, int width) {
        return 0;
    }

    @Override
    public int figuraArea(int radius) {
        figurS = (int) pi * radius^2;
        System.out.println("S circle: "+figurS);
        return figurS;
    }


    public int summSOfFigures(int figurS) {
        totalS += figurS;
        System.out.println(totalS);
        return totalS;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

