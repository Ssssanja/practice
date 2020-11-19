package Algorithmization.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays4 {
    public static void main(String[] args) {
       int [] array = new int[1000];                                  //создание массива (последовательности)
        for (int i = 0; i<1000; i++){
            array[i] = i;                                             //заполнение
        }
        int min = array[0];
        int max = array[0];
        for (int x : array){                                            /* перебор массива с поиском наименьшего и наибольшего элементов*/
            if (x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
        }
        for (int i = 0; i<array.length; i++){                          //перебор массива
            if (array[i]==min){                                        //если элемент массива равен минимуму
                array[i]=max;                                          //заменить его значение на максимум
            }
            if (array[i]==max){                                        //то же самое, ток наоборот
                array[i]=min;
            }
        }
    }
}
