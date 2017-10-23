package com.epam.drepin.Shapes;

public class Circle_01 extends GeometryShape_01 {
    //необязательная аннотация. проверяет является ли метод ниже реализацией одного из родительских
    // если написать override перед методом, который не был описан в интерфейсе (или родительском классе)
    // то компилятор его подчеркнет
    private double radius; //не используем int потому что радиус может быть не целым числом
    @Override
    public double calculateSquare_01() {

        return Math.PI*radius*radius;
    }
}
