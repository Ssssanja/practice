package Algorithmization.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays5 {
    public static void main(String[] args) throws IOException {
        int [] array = new int[1000];                                  //создание массива (последовательности)
        for (int i = 0; i<1000; i++){
            array[i] = i;                                             //заполнение
        }
        System.out.println("Введите чило i:");                        //запрос i
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());                  // считывание i

        for (int x: array){                                           //перебор массива
            if (x>i){                                                 //если элемент > i
                System.out.print(x + " ");                            // вывести элемент на печать
            }
        }
    }
}
