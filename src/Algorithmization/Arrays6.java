package Algorithmization;

import java.math.BigInteger;

public class Arrays6 {
    public static void main(String[] args) {
        int [] array = new int[1000];                                  //создание массива (последовательности)
        for (int i = 0; i<1000; i++){
            array[i] = i;                                             //заполнение
        }
        int result = 0;
        for (int i = 0; i<array.length; i++){                           //перебор массива
            if (isSimple(i)){                                           //проверяем индекс на простоту
                result+=array[i];                                       //если индекс простой - плюсуем элемент к результату
            }
        }
        System.out.println(result);
    }

    public static boolean isSimple(int x){                              //метод проверки на простоту
        int dividers = 0;                                               //количество делителей
        for (int j = 2; j<x; j++){                                      //проверка делителей, от 2 до число-1
            if (x%j==0){                                                //если остаток от деления = 0
                dividers++;                                             //итерируем кол-во делителей
            }
        }
        if (dividers==0){                                               //если делителей 0 - число простое
            return true;
        }
        else return false;                                              // иначе - составное
    }
}
