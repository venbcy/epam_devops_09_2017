package com.epam.drepin;
//Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон представленны в массиве.
//        Необходимо найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
//        (Опционально) Найти человека, который прибежал вторым.
public class Example3 {
public static void main(String...args) {
    procedureStyleSolution();
    oopSolution();
        }

    private static void oopSolution() {
        Record[] records = new Record[]{// фигурные скобки значат что мы сразу туда помещаем элементы
            new Record("Elena", 341),
            new Record("Thomas", 273)
                // ...

    };
    }

    static class Record {
        String name;
        int time;
        Record(String name, int time){
            this.name = name;
            this.time = time;
        }
    }
    private static void procedureStyleSolution() {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
        //procedureStyleSolution(names, times);
        //oopSolution1();
        //oopSolution2(names, times);
        // TODO поиск победителя
        int lowestTime = times[0];
        int index = 0;
        for (int i = 0; i < times.length; i++) {
            if (lowestTime >= times[i]){
                lowestTime = times [i];
                index = i;
            }
        }
        System.out.println(names[index] + ": " + lowestTime);
    }


}
