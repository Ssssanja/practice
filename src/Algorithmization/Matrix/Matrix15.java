package Algorithmization.Matrix;

public class Matrix15 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) (Math.random() * 10 - 5);         //заполнение матрицы рандомными числами
            }
        }

        System.out.println("Матрица до сортировки:");
        int max = matrix[0][0];                                         //для хранения макс. элемента. Инициализация первым элементом матрицы
        for (int i = 0; i < 7; i++) {                                   //вывод матрицы на печать
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j]>max){                                  //если элемент больше максимума
                    max = matrix[i][j];                                 //обновить максимум
                }
            }
            System.out.println();
        }

        System.out.println("Наибольший элемент - " + max + "\nМеняем все нечётные элементы на него:\n");

        for (int i = 0; i < 7; i++) {                                   //перебор
            for (int j = 0; j < 7; j++) {
                if (j%2!=0){                                            //если индекс столбца нечётный
                    matrix[i][j]=max;                                   //присвоить элементу значение max
                }
            }
        }

        for (int i = 0; i < 7; i++) {                                   //вывод матрицы на печать
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
