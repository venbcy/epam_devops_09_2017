package com.epam.drepin;
//На вход программе подается несколько строк (через параметры командной строки args).
//       Среди них необходимо найти и вывести на экран наибольшую и наименьшую по длине строки.
//        Если строк с одинаковой длиной несколько - вывести последнюю из них.
//       Длину строки можно получить вызвав метод .length() на объекте типа String.
//
//       Входные данные:
//       a abc edf q
//
//        Вывод:
                //       Минимальная строка среди представленных: q
//       Максимальная строка среди представленных: edf
public class Example2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        String min = args[0];
        String max = min;
Integer l = 1;
        for (int i = l; i < args.length; i++) {
            if (args[i].length() <= min.length()){
                min = args[i];
            }
            if (args[i].length() >= min.length()){
                max = args[i];
            }
        }

    }
}
