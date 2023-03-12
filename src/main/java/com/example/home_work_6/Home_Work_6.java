package com.example.home_work_6;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Home_Work_6 {

    public static void main(String[] args) {

        Employee dima = new Employee("Dima Sv", "Economist", "sdfsdf", 12313, 45465);
        int age = dima.getAge();
        System.out.println(age);
        dima.setAge(15);
        age = dima.getAge();
        System.out.println(age);

        System.out.println(dima);


    }


}
