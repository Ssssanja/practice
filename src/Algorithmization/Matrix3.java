package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите индекс строки к, от 0 до 4:");                      //запрос индекса строки
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

        for (int i = 0; i<5; i++){                                                      //вывод матрицы на печать
            for (int j = 0; j<5; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Строка к: ");                                           //вывод строки с индексом к
        for (int i = 0; i<5; i++){
            System.out.print(matrix[k][i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Столбец p: ");                                           //вывод столбца с индексом р
        for (int i = 0; i<5; i++){
            System.out.println(matrix[i][p]);
        }
    }
}
