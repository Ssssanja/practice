package Algorithmization.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы N:");                                //запрос размера матрицы
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();

        double [][] matrix= new double[n][n];

        for (int i = 0; i<n ; i++){                             //заполнение матрицы по формуле
            for (int j = 0; j<n; j++){
                matrix[i][j] = Math.sin((Math.sqrt(i)-Math.sqrt(j))/2);
            }
        }

        int count = 0;
        for (int i = 0; i<n; i++){                                   //подсчёт положительных элементов в матрице
            for (int j = 0; j<n; j++){
                if (matrix[i][j]>0){
                    count++;
                }
            }
        }
        System.out.println("Количество положительных элементов в матрице: " + count);

    }
}
