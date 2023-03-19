package com.example.home_work_8.geometry;

import java.util.Arrays;

public interface Geometry {

    int figuraArea(int height,int width);

    int figuraArea(int width);

    default int summSOfFigures(int figurS){
        int totalS = figurS;
        return totalS;

    }




    static void main(String[] args) {

        Geometry triangle = new Triangle(10,30);
        Geometry square = new Square(20);
        Geometry circle = new Circle(20);
        var figures = Arrays.asList(triangle,square,circle);
        for (Geometry s: figures) {
            System.out.println(s.summSOfFigures());

        }



    }


//    static int summSOfFigures(int figurS) {
//        int summSOfFigures;
//                summSOfFigures = Triangle.triangleS + Square.squareS + Circle.circleS;
//        return summSOfFigures;


    }




