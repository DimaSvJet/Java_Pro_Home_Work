package com.example.home_work_8;

import com.example.home_work_8.gameplay.*;
import com.example.home_work_8.geometry.Circle;
import com.example.home_work_8.geometry.Geometry;
import com.example.home_work_8.geometry.Square;
import com.example.home_work_8.geometry.Triangle;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int totalS = 0;
        Geometry triangle = new Triangle(10, 30);
        Geometry square = new Square(20);
        Geometry circle = new Circle(20);
        Geometry[] figuresG = {triangle, square, circle};
        var figures = Arrays.asList(triangle, square, circle);
        for (Geometry s : figures) {
            totalS += s.getFigureS();
        }
        System.out.println("1) " + totalS);

        System.out.println("2) " + Geometry.summAllSFigures(figuresG));

        System.out.println(" ");
        //Gameplay!!!

        Member human1 = new Human("Danya", 500, 2);
        Member robotic1 = new Robotic("Cyrax", 5000, 1);
        Member cat1 = new Cat("Jorick", 200, 3);
        System.out.println(human1);
        System.out.println(robotic1);
        System.out.println(cat1);

        human1.jump();
        cat1.jump();
        cat1.run();

        Obstacle treadmill1 = new Treadmill(300);
        Obstacle wall1 = new Wall(2);
        System.out.println(treadmill1);
        System.out.println(wall1);

        var members = Arrays.asList(human1, robotic1, cat1);
        var obstacles = Arrays.asList(treadmill1, wall1);

        for (Member m : members) {
            for (Obstacle o : obstacles) {
                if (obstacles.indexOf(o) == 0) {
                    if (m.getRun() >= o.getDistance()) {
                        System.out.println(m.getName() + " has passed " + o.getName() + " " + o.getDistance());
                    } else {
                        m.setStatus(false);
                        System.out.println(m.getName() + " could not pass " + o.getName() + " " + o.getDistance() +
                                " and get out of the competition");
                    }
                } else if ((obstacles.indexOf(o) == 1) && (m.isStatus() == true)) {
                    if (m.getJump() >= o.getHight()) {
                        System.out.println(m.getName() + " has passed " + o.getName() + " " + o.getHight());
                    } else {
                        System.out.println(m.getName() + " could not pass " + o.getName() + " " + o.getHight());
                    }
                }
            }

        }

    }
}







