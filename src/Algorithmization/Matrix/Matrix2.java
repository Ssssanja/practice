package Algorithmization.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы N:");                                //запрос размера матрицы
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();
        int [][] matrix= new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                matrix[i][j] = (int) (Math.random() * 10);                              //заполнение матрицы рандомными числами
            }
        }
        for (int i = 0; i<n; i++){                                                      //вывод матрицы на печать
            for (int j = 0; j<n; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<n; i++){                                                      //вывод диагонали слева направо сверху вниз
            for (int j = 0; j<i; j++){                                                  //красиво только если элементы в таблице однозначные положительные числа
                System.out.print("  ");
            }
            System.out.println(matrix[i][i]);
        }
    }
}
