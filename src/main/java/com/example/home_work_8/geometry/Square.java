package com.example.home_work_8.geometry;

public class Square implements Geometry {

    public static int totalS;
    private static int figurS;
    private int width;


    public Square(int width) {
        this.width = width;
        this.figurS = figuraArea(width,0);
    }

    @Override
    public int figuraArea(int width, int height) {
        figurS = width*width;
        System.out.println("S square: " + figurS);
        return figurS;
    }

    @Override
    public int summSOfFigures(int figurS) {
        totalS += figurS;
        System.out.println(totalS);
        return totalS;
    }

    @Override
    public int figuraArea(int radius) {
        return 0;
    }


}
