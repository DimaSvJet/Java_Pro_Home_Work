package com.example.home_work_8.gameplay;

public class Wall implements Obstacle {

    private int hight;
    final String name;

    public Wall(int hight) {
        this.name = "Wall";
        this.hight = hight;
    }

    @Override
    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void overcome() {
        System.out.println("The distance of Treadmill is " + getHight());
    }

    @Override
    public int getDistance() {
        return 0;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                '}';
    }
}
