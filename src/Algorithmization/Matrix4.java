package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы N(Чётное):");                                //запрос размера матрицы
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());                                    //считывание с клавиатуры
        reader.close();

        int [][] matrix= new int[n][n];

        for (int i = 0; i<n; i++){
            if (i%2!=0) {                                            //если строка нечётная
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = n-j;                              //заполнение строки числами n-1
                }
            }
            else{
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j+1;                              //иначе заполнение строки числами от 1 до n
                }
            }
        }

        for (int i = 0; i<n; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<n; j++){
                System.out.print(matrix [i][j] + " ");
            }
        }

    }
}
