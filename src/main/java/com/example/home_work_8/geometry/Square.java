package com.example.home_work_8.geometry;

public class Square implements Geometry {

    private int squareS;
    private int width;

    public Square(int width) {
        this.width = width;
        this.squareS = figuraArea(width, 0);
    }

    @Override
    public int figuraArea(int width, int height) {
        int figurS = width*width;
        System.out.println("S square: " + figurS);
        return figurS;
    }

    public int getSquareS() {
        return squareS;
    }

    @Override
    public int getFigureS() {
        return squareS;
    }

    public void setSquareS(int squareS) {
        this.squareS = squareS;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
