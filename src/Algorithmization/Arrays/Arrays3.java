package Algorithmization.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива N");        //запрос числа N
        int n = Integer.parseInt(reader.readLine());                //считывание
        reader.close();
        int [] array = new int[n];                                  //создание массива
        for (int i = 0; i<n; i++){
            array[i] = (int)(Math.random()*n - n/2);                //заполнение рандомными числами
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int x: array){                                         //перебор массива с подсчётом
            if (x<0){
                negative++;
            }
            else if (x>0){
                positive++;
            }
            else {
                zero++;
            }
        }
        System.out.println("В массиве:");
        System.out.println("Положительных чисел - " + positive);
        System.out.println("Отрицательных чисел - " + negative);
        System.out.println("Нулей - " + zero);                      //вывод результатов

    }
}
