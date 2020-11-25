package Algorithmization.ArraysPlusSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysPlusSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //запрос индекса
        System.out.println("Введите k (индекс для вставки, от 0 до 10):");
        int k = Integer.parseInt(reader.readLine());
        reader.close();
        int[]arrayFirst = new int[10];                                                      //инициализация массива 1
        int[]arraySecond = new int[arrayFirst.length + ((int)(Math.random()*10) + 1)];      //инициализация массива 2 на какой-либо размер больше 1-го
        for (int i = 0; i<arrayFirst.length; i++){
            arrayFirst[i] = (int)(Math.random()*100);                                       //заполнение рандомными числами массива 1
        }
        for (int i = 0; i<arraySecond.length; i++){
            arraySecond[i] = (int)(Math.random()*100);                                      //заполнение рандомными числами массива 1
        }
        System.out.println("Массив 1: ");
        for (int x : arrayFirst){                                                           //вывод массивов на печать
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Массив 2: ");
        for (int x : arraySecond){
            System.out.print(x + " ");
        }
        int[]arrayThird = new int[(arrayFirst.length+arraySecond.length)];                  //инициализация третьего массива размером как вместе взятые первый и второй
        for (int i = 0; i<arrayThird.length; i++){                                          //заполнение по итерации
            if (i<=k){                                                                      //если индекс <=k
                arrayThird[i]=arrayFirst[i];                                                //заполняем элементами первого массива
            }
            else if (i<=(k+arraySecond.length)){                                            //иначе если индекс <= к плюс длина второго массива
                arrayThird[i] = arraySecond[i-k-1];                                         //заполняем элементами второго массива

            }
            else{                                                                           //иначе
                arrayThird[i] = arrayFirst[i-arraySecond.length];                           //заполняем элементами первого массива от k+1 до последнего
            }
        }
        System.out.println();
        System.out.println("Массив 3: ");
        for (int x : arrayThird){
            System.out.print(x + " ");
        }
    }
}
