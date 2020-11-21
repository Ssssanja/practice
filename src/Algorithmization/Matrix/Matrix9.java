package Algorithmization.Matrix;

import java.io.IOException;

public class Matrix9 {
    public static void main(String[] args) throws IOException {
        int [][] matrix= new int[5][5];
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                matrix[i][j] = (int) (Math.random() * 10);                              //заполнение матрицы рандомными числами
            }
        }
        int max = 0;                                                                    //для хранения максимальной суммы
        int index = 0;                                                                  //для хранения индекса столбца
        for (int i = 0; i<5; i++){                                                      //перебор матрицы
            int sumOfNumbsInColumn = 0;                                                 //для хранения суммы столбца
            for (int j = 0; j<5; j++){
                sumOfNumbsInColumn += matrix[j][i];                                     //подсчёт суммы в столбце
            }
            if (max<sumOfNumbsInColumn){                                                //если на данный момент максимум меньше суммы столбца
                max = sumOfNumbsInColumn;                                               //обновить максимум
                index = i;                                                              //обновить индекс
            }
        }
        for (int i = 0; i<5; i++){                                   //вывод матрицы на печать
            for (int j = 0; j<5; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Столбец с индексом " + index + " имеет наибольшую сумму: " + max); //вывод
    }
}
