package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix8 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите индекс столбца к, от 0 до 4:");                      //запрос индекса строки
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        System.out.println("Введите индекс столбца p, от 0 до 4:");                     //запрос индекса столбца
        int p = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();
        int [][] matrix= new int[5][5];
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                matrix[i][j] = (int) (Math.random() * 10);                              //заполнение матрицы рандомными числами
            }
        }
        System.out.println("Матрица до замены столбцов:");
        for (int i = 0; i<5; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<5; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<5; i++){                                   //построчно
            int temp = matrix[i][k];                                 //временная переменная хранит значение элемента к-того столбца
            matrix[i][k] = matrix[i][p];                             //элементу к-го столбца присваивается соответствующее значение р-того столбца
            matrix[i][p] = temp;                                     //элементу р-го столбца присваивается значение временной переменной(значение элемента к-того столбца)
        }
        System.out.println("Матрица после замены столбцов");
        for (int i = 0; i<5; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<5; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
