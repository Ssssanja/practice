package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы N(Чётное):");                                //запрос размера матрицы
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();

        int [][] matrix= new int[n][n];

        for (int i = 0; i<n ; i++){                             //заполнение матрицы единицами
            for (int j = 0; j<n; j++){
                matrix[i][j] = 1;

            }
            if (i>0&&i<n/2){                                    //если строка до n/2
                for (int l = 0; l<(n-(n-i)); l++){
                    matrix[i][l] = 0;                           //заполняем от первого до номер строки минус один нулями
                    matrix[i][n-1-l] = 0;                       //заполняем зеркально нулями в этой строке
                }

            }
            else if (i>0){                                      //если строка n/2 или более
                for (int l = 0; l<(n-1-i); l++){
                    matrix[i][l] = 0;                           //проворачиваем тот же цикл, только по убывающей
                    matrix[i][n-1-l] = 0;
                }
            }

        }

        for (int i = 0; i<n; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<n; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
