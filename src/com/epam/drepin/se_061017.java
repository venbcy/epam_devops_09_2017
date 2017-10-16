package com.epam.drepin;

public class se_061017 {
    public static void main (String[] args) { //args это массив строк. любой массив имеет размер
        System.out.println(args.length);
        int total_lenght = 0;  //double выбираем чтобы результат мог получиться дробный
        // чуть сложнее вариант:
        // float total_length = 0
        // for (int i = 0; i < args.length();

        for (String currentString : args) {
            total_lenght += currentString.length();

        }

        System.out.println(total_lenght / args.length);
        // может быть проблема деления на ноль
        }
    }

