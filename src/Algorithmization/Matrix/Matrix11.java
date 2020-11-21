package Algorithmization.Matrix;

import java.util.ArrayList;

public class Matrix11 {
    public static void main(String[] args) {
        int [][] matrix= new int[10][20];
        for (int i = 0; i<10; i++){
            for (int j = 0; j<20; j++){
                matrix[i][j] = (int) (Math.random() * 16);                              //заполнение матрицы рандомными числами
            }
        }
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i<10; i++){                                   //вывод матрицы на печать
            int count = 0;                                            //для подсчёта повторений
            for (int j = 0; j<20; j++){
                System.out.print(matrix [i][j] + " ");
                if (matrix [i][j]==5)   {                             //если элементы равен 5
                    count++;                                          //инкремент подсчёта
                }
            }
            System.out.println();
            if (count>=3){                                            //если повторений 3 и более
                results.add(i);                                       //сохранить индекс строки в список
            }

        }
        System.out.println("Индексы строк, в которых число 5 встречается 3 и более раз: " + results.toString()); //вывод
    }
}
