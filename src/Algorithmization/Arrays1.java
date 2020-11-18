package Algorithmization;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays1 {
    public static void main(String[] args) throws IOException {
        int result = 0;

        int[]a = new int[1000];                 // создание массива
    for (int i = 1; i<1000; i++){               // заполнение
        a[i] = i;                               // массива
    }
        System.out.println("Введите число К:"); //запрос данного к
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());   // считывание введённого к
        for (int x: a){                         // перебор массива
            if (x%k==0){                        // если остаток от деления элемента на к равен нулю
                result+=x;                      // прибавить элемент к результату
            }
        }
        System.out.println(result);             // вывести результат
    }
}
