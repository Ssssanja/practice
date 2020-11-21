package Algorithmization.Matrix;


public class Matrix13 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) (Math.random() * 10 - 5);                              //заполнение матрицы рандомными числами
            }
        }

        System.out.println("Матрица до сортировки:");
        for (int i = 0; i < 7; i++) {                                   //вывод матрицы на печать
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<7; i++){                                          //сортировка по убыванию сверху вниз по столбцам
            sortMatrixColumnDown(matrix, i);
        }

            System.out.println("Матрица после сортировки по убыванию:");
            for (int i = 0; i < 7; i++) {                                   //вывод отсортированной матрицы
                for (int j = 0; j < 7; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        for (int i = 0; i<7; i++){                                          //Сортировка по возрастанию сверху вниз по столбцам
            sortMatrixColumnUp(matrix, i);
        }

        System.out.println("Матрица после сортировки по возрастанию:");
        for (int i = 0; i < 7; i++) {                                   //вывод отсортированной матрицы
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        }



    static void sortMatrixColumnDown (int [][] matrix, int column) {            //метод для сортировки, принимает матрицу и номер столбца
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int k = 0; k < matrix.length - 1; k++) {
                if (matrix[k][column] < matrix[k + 1][column]) {
                    temp = matrix[k][column];
                    matrix[k][column] = matrix[k + 1][column];
                    matrix[k + 1][column] = temp;
                    flag = true;
                }
            }
        }
    }

    static void sortMatrixColumnUp (int [][] matrix, int column) {              ////метод для сортировки, принимает матрицу и номер столбца
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int k = 0; k < matrix.length - 1; k++) {
                if (matrix[k][column] > matrix[k + 1][column]) {
                    temp = matrix[k+1][column];
                    matrix[k+1][column] = matrix[k][column];
                    matrix[k][column] = temp;
                    flag = true;
                }
            }
        }
    }


    }

