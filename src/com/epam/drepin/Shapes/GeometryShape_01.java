package com.epam.drepin.Shapes;

abstract class GeometryShape_01 implements CalculableSquare_01{
    private int x;
    private int y;
// этот класс не реализует метод вычисления площади, просто его предоставляет
    // этот класс говорит что этот метод (Calculated square) должен быть у
    // всех наследников этого класса

  //  public abstract double calculatedSquare(); - убираем это так как добавили интферейс
//метод абстрактный по той же причине что и класс
    public GeometryShape_01 (){
        // необязательные писать что x=0 и y=0 - х и y и так нули по дефолту
x = 0;
    }
    public GeometryShape_01 (int x, int y) {
        // этот конструктор можно вызывать в каком-нибудь дочернем классе через super
        // this нужен когда в этой области видимости есть переменная с таким же именем
        this.x = x;
        this.y = y;

    }
    // инкапсуляция - связь кода и данных плюс защита от внешнего воздействия -
    // переменные x y спрятаны но мы к ним теперь не имеем доступа


    public int getX() {
        return x;
        //todo - идея автоматом подставила getX() - это установленное имя для геттера? или она просто так советует?
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Geometry shape [" + x + "," + y + "]";
    }
}
