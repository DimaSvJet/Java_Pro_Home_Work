package com.example.home_work_8.gameplay;

public abstract class Member {

    private String name;
    private int run;
    private int jump;

    public Member(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public void run() {
        System.out.println(getName()+" вміє біжати відстань: "+getRun()+" м.");
    }

    public void jump (){
        System.out.println(getName()+" вміє стрибати на висоту: "+getJump()+" м.");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", jump=" + jump +
                '}';
    }
}

