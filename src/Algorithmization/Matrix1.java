package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix1 {
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
        for (int i = 0; i<n; i++) {                                                     //цикл для перебора чисел в столбце
            if (i%2!=0) {                                                               //если индекс столбца нечётный
                if (matrix[0][i] > matrix[n - 1][i]) {                                  //если первый элемент больше последнего
                    System.out.println("Столбец с индексом " + i);                      //вывод столбца на печать
                    for (int j = 0; j < n; j++) {
                        System.out.println(matrix[j][i]);
                    }
                }
                System.out.println();
            }
        }
    }
}
