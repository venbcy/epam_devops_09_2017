package com.epam.drepin;

public class Practice_01 {
    public static void main(String[] args) {
        string_practice();
    }

    public static void string_practice () {
        String str_a = "10 14";
        try {
            int a = Integer.valueOf(str_a, 16);
            System.out.println(a);
        } catch (NumberFormatException ex) {
            System.out.println(ex + " is not allowed");
        }
        }

    }


