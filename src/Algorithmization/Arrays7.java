package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите n:");                               //запрос n
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                    //считывание n
        reader.close();
        int [] array = new int[n];                                      //создание массива (последовательности)
        for (int i = 0; i<n; i++){
            int j = i + 1;
            if (j<((2*n)-i));
            array[i] = j + ((2*n)-i);                                   //заполнение
        }
        int max = array[0];
        for (int x : array){                                            //перебор массива с поиском max
            if (x>max){
                max = x;
            }
        }
        System.out.println(max);                                        //вывод max
    }
}
