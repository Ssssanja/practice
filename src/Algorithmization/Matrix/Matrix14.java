package Algorithmization.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите m:");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите n:");
        reader.close();
        int n = Integer.parseInt(reader.readLine());
        if ((n-m)>1){
            System.out.println("вы хотите впихнуть " + (n-1) + " единиц в столбик под максимальным индексом " + m + "\n давайте другие числа в следующий раз");
        }
        else {
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;                              //заполнение матрицы нуликами
                }
            }

            for (int i = 0; i < n; i++) {
                fillColumn(matrix, i, m);
            }

            System.out.println("Матрица " + m + " на " + n + ":");
            for (int i = 0; i < m; i++) {                                   //вывод матрицы на печать
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    static void fillColumn (int [][] matrix, int column, int m) {            //метод, заполнающий столбец единичками в рандомных местах
            int times = column;
            while (times>0){
                int randomindex = (int) (Math.random() * (m));
                if (matrix[randomindex][column]==0){
                    matrix[randomindex][column]=1;
                    times--;
                }
            }
    }
}
