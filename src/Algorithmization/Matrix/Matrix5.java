package Algorithmization.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы N(Чётное):");                                //запрос размера матрицы
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();

        int [][] matrix= new int[n][n];

        for (int i = 0; i<n; i++) {                                                     //заполнение матрицы
            for (int j = 0; j<n;j++){                                                   //вложенный цикл заполняет строки цифрами по инкременту
                matrix[i][j] = i+1;
            }
            for (int j = n-1; j>n-(i+1);j--){                                           //вложенный цикл заполняет строки нулями по декременту
                matrix[i][j] = 0;
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
