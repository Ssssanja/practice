package Algorithmization.Matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Matrix10 {
    public static void main(String[] args) {
        int [][] matrix= new int[5][5];
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                matrix[i][j] = (int) (Math.random() * 10-5);                              //заполнение матрицы рандомными числами
            }
        }
        ArrayList<Integer> positiveNumbers = new ArrayList<>();                           //для хранения положительных чисел
        for (int i = 0; i<5; i++){
            if (matrix[i][i]>0){                                                          //если элемент главной диагонали положительный
                positiveNumbers.add(matrix[i][i]);                                        //положите в список
            }
        }
        if (!positiveNumbers.isEmpty()){
            System.out.println("Положительные элементы главной диагонали: " + positiveNumbers.toString());  //вывод
        }
    }
}
