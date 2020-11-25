package Algorithmization.ArraysPlusSort;

import java.io.IOException;

public class ArraysPlusSort2 {
    public static void main(String[] args){
        int[]arrayFirst = new int[((int)((Math.random()*10) + 5))];                                                      //инициализация массивов
        int[]arraySecond = new int[arrayFirst.length + ((int)(Math.random()*10) + 1)];
        int n = (int)(Math.PI*arrayFirst.length);                                                                        //рандомное заполнение, но с увеличением
        int m = n+1;
        arrayFirst[0] = 0;
        for (int i = 1; i<arrayFirst.length; i++){
            arrayFirst[i] = arrayFirst[i-1] + ((int)(Math.random()*3));
        }
        arraySecond[0] = 0;
        for (int i = 1; i<arraySecond.length; i++){
            arraySecond[i] = arraySecond[i-1] + ((int)(Math.random()*3));
        }
        int min = arrayFirst[0];                                                            //переменная для хранения минимума
        int max = arraySecond[0];                                                           //переменная для хранения максимума
        System.out.println("Массив 1: ");
        for (int x : arrayFirst){                                                           //вывод массивов на печать
            System.out.print(x + " ");                                                      //с одновременным поиском мин и макс в обоих массивах
            if (x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
        }
        System.out.println();
        System.out.println("Массив 2: ");
        for (int x : arraySecond){
            System.out.print(x + " ");
            if (x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
        }
        int index = 0;                                                                      //счётчик для указания позиции в третьем массиве
        int[]arrayThird = new int[(arrayFirst.length+arraySecond.length)];                  //инициализация третьего массива размером как вместе взятые первый и второй
        do{                                                                                 //ду-уайл
            boolean match = false;                                                          //совпадение по умолчанию фолс
            for (int i = 0; i<arrayFirst.length; i++){                                      //перебор первого массива
                if (arrayFirst[i]==min){                                                    //если элемент первого массива равен текущему минимуму
                    arrayThird[index] = arrayFirst[i];                                      //добавить в третий массив по индексу [index]
                    arrayFirst[i] = min-1;                                                  //уменьшить исходный элемент в первом массиве
                    index++;                                                                //инкремент индекса
                    match = true;                                                           //совпадение - тру
                }
            }
            for (int i = 0; i<arraySecond.length; i++){                                     //та же петрушка, как в первом, но проворачиваем со вторым
                if (arraySecond[i]==min){
                    arrayThird[index] = arraySecond[i];
                    arraySecond[i] = min-1;
                    index++;
                    match = true;
                }
            }
            if (match == false){                                                            //если совпадений не было - инкремент минимума
                min++;
            }


        } while (index<arrayThird.length);                                                  //цикл крутится, пока индекс не пройдёт весь третий массив

        System.out.println();
        System.out.println("Массив 3: ");
        for (int x : arrayThird){
            System.out.print(x + " ");
        }
    }
}
