package com.example.home_work_6;

public class Employee {
    private String yorName;
    private String position;
    private String eMail;
    private int tel;
    private int age;

    public Employee(String yorName, String position, String eMail, int tel, int age) {
        this.yorName = yorName;
        this.position = position;
        this.eMail = eMail;
        this.tel = tel;
        this.age = age;
    }

    public String getYorName() {
        return yorName;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public int getTel() {
        return tel;
    }

    public int getAge() {
        return age;
    }

    public void setYorName(String yorName) {
        this.yorName = yorName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "yorName='" + yorName + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", tel=" + tel +
                ", age=" + age +
                '}';
    }
}
