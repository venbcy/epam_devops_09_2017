package com.epam.drepin.Shapes;

public class GeometryExample01 {
    public static void main(String[] args) {

        Rectangle_01 rectangle = new Rectangle_01(5,2);
        System.out.println(rectangle);
        //см вариант оригинального задания констант ниже
//        int width = 5;
//        int height = 2;
//        Rectangle_01 rectangle = new Rectangle_01(width,height);
        // "GeometryShape_01 shape = new GeometryShape_01(1,2 );" нельзя выполнить, т.к.
        // объекты абстрактного класса нельзя создавать

        //Rectangle_01 inPosition = new Rectangle_01(5,3,10,10);
        //System.out.println(inPosition);
    }
}
