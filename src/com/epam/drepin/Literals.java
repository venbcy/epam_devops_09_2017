package com.epam.drepin;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Literals {
    public static void main(String[] args) {
        System.out.println(2_100_000_000); // <- parse as int
        System.out.println(2_300_000_000L); // <-- parse as long
        System.out.println(02_300_000_000L); // parse as octal long literal
        System.out.println(0XFFFFFE); // as hex int
        System.out.println(0b01010101010101L); // parse as binary long
        System.out.println(123.333e5); // the same as 12333330  10 in 5

        System.out.println('a'); // parse as symbol
        System.out.println("a"); // parse as string
        System.out.println('\u263a');
        System.out.println('\'');
        System.out.println(System.lineSeparator());
    }

    public static void integerCache(){
    Integer a = 127;// автоматический боксинг. java проверит если ты значение к кэше
    Integer b = 127;
    System.out.println(a.equals(b)); // правильное сравнение
    System.out.println(a == b);

    a = 128;
    b = 128;
    System.out.println(a == b); // сравнение ссылочных типов
    }
}
