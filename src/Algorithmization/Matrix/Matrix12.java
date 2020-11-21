package Algorithmization.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Сортировка по убыванию, или возрастанию элемента в строке? 0 - убывание, 1 - возрастание");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean sortngOrder = false;
        if (Integer.parseInt(reader.readLine())==1){
            sortngOrder = true;
        }
        int [][] matrix= new int[7][7];
        for (int i = 0; i<7; i++){
            for (int j = 0; j<7; j++){
                matrix[i][j] = (int) (Math.random() * 10-5);                              //заполнение матрицы рандомными числами
            }
        }

        System.out.println("Матрица до сортировки:");
        for (int i = 0; i<7; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<7; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<7; i++){                                  //сортировка выбором, делается одинаково в обоих случаях
            sort(matrix[i]);
        }

        if (sortngOrder){
            System.out.println("Матрица после сортировки по возрастанию:");
        for (int i = 0; i<7; i++){                                   //вывод отсортированной матрицы
            for (int j = 0; j<7; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
        }
        else {
            System.out.println("Матрица после сортировки по убыванию:");
            for (int i = 0; i<7; i++){                                   //вывод отсортированной матрицы, при переборе строк непосредственно перед печатью каждая строка разворачивается
                for (int x : reverse(matrix[i])){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }


    }

    public static int[] reverse(int[]array){                                //метод для разворота строки
        int[]reversed = new int[array.length];                              //создаётся новый массив такого же размера, в который заносятся значения в обратном порядке
        for (int i = array.length-1; i>0;){
            for (int j = 0; j<array.length; j++){
                reversed[j]=array[i];
                i--;
            }
        }
        return reversed;                                                    //вернуть обратный массив
    }

    public static void sort(int[]array){                                    //сортировка пузырьком, в два цикла
        for(int i = array.length-1 ; i > 0 ; i--){                          //внешний цикл, проход с конца к началу
            for(int j = 0 ; j < i ; j++){                                   //внутренний цикл, с начала к концу
            if( array[j] > array[j+1] ){                                    //если элемент больше следующего
                int tmp = array[j];                                         //меняем местами
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
        }
    }
    }

}
