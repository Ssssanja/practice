package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива N");        //запрос числа N
        int n = Integer.parseInt(reader.readLine());                //считывание
        reader.close();
        int [] array = new int[n];                                  //создание массива
        for (int i = 0; i<n; i++){
            array[i] = (int)(Math.random()*n - n/2);                //заполнение рандомными числами
        }
        System.out.println("массив до сжатия:");
        for (int x : array){
            System.out.print(x + " ");
        }
        for (int i = 1; i<array.length; i++){                       //перебор
            if (i%2!=0){                                            //если индекс нечётный
                array[i]=0;                                         //заменить значение на ноль
            }
        }
        System.out.println();
        System.out.println("массив после сжатия:");
        for (int x : array){
            System.out.print(x + " ");
        }
    }
}
