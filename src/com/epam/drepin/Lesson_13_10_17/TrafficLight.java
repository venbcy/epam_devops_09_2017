package com.epam.drepin.Lesson_13_10_17;
//так же решить эту задачу через switch
public class TrafficLight {

    public static void main(String args[])
    {
        //Integer value = Integer.parseInt(args[0]);
        int time = Integer.parseInt(args[0]) % 10;
        if (time >= 0 & time <= 3) {
            System.out.println("It's green light with " + time + " as " + args[0] + " and " + time + " as divison by 10");
        }
        //else if -- через эту конструкцию чуть менее затратно
        if (time >= 4 & time <= 5) {
            System.out.println("It's yellow light with " + time + " as " + args[0] + " and " + time + " as divison by 10");
        }
        //else
        if (time >= 6 & time <= 9) {
            System.out.println("It's red light with " + time + " as " + args[0] + " and " + time + " as divison by 10");
        }
    }
}