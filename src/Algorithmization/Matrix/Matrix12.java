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
        int[]reversed = new int[array.length];
        for (int i = array.length-1; i>0;){
            for (int j = 0; j<array.length; j++){
                reversed[j]=array[i];
                i--;
            }
        }
        return reversed;
    }

    public static void sort(int[]array){                                    //сортировка выбором, взято тут: http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/
        /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

}
