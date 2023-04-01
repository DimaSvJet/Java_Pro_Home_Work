package com.example.home_work_8.gameplay;

public class Treadmill implements Obstacle {

    private int distance;
    final String name;

    public Treadmill(int distance) {
        this.name = "Treadmill";
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHight() {
        return 0;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void overcome() {
        System.out.println("The distance of Treadmill is " + getDistance());
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
