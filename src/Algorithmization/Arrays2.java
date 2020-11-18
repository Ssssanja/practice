package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays2 {
    public static void main(String[] args) throws IOException {
        int[]a = new int[1000];                 // создание массива
        for (int i = 1; i<1000; i++) {               // заполнение
            a[i] = i;                               // массива
        }
        System.out.println("Введите число Z:"); //запрос данного z
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(reader.readLine());   // считывание введённого z
        for (int i = 0; i<a.length; i++){                         // перебор массива
            if (a[i]>z){                        // если элемент больше z
                a[i] = z;                       // присвоить элементу значение z
            }
        }
    }
}
