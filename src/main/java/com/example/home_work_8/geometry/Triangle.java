package com.example.home_work_8.geometry;

public class Triangle implements Geometry {

    final private int radius = 0;
    private static int figurS;
    private static int totalS;
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
        figurS = (height*width)/2;
        System.out.println("S triangle: " + figurS);
        return figurS;
    }

    public int summSOfFigures(int figurS) {
        totalS += figurS;
        System.out.println(totalS);
        return totalS;
    }

    @Override
    public int figuraArea(int radius) {
        return 0;
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
