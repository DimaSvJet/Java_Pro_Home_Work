package com.example.home_work_8.geometry;

import java.lang.reflect.Array;
import java.util.Arrays;

public interface Geometry {

    int figuraArea(int width, int height);

    int getFigureS();
    static int summAllSFigures (Geometry [] figures) {
        int totalS = 0;
        for (Geometry s : figures) {
            totalS +=s.getFigureS();
        };
        return totalS;
    }



    static void main(String[] args) {



    }
}



