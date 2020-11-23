package Algorithmization.Matrix;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //запрос порядка
        System.out.println("Введите n (лучше 3, решит быстро, для 4 - может быть вам хватит терпения дождаться решения, для 5 тоже решит, но вы вряд ли дождётесь):");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int m = (n*(n*n+1))/2;                                          //магическая константа
        int[][] matrix;
        while (true) {
            matrix = fill(n);                                           //получить рандомную матрицу
            if (verticalCheck(matrix,m)&&                               //если проверка пройдена
                    horisontalCheck(matrix,m)&&
                    (sumMainDiagonal(matrix, m))&&
                    sumSideDiagonal(matrix, m)){
                break;                                                  //прервать цикл
            }
        }
        for (int i = 0; i < n; i++) {                                   //вывод матрицы на печать
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] fill (int n){                                //метод для заполнения матрицы в рандомном порядке от 1 до 9
        int[][]matrix = new int[n][n];
        int count = n*n;                                        //обратный счётчик равный n в квадрате
        while (count>0){                                        //пока счётчик больше нуля
            int x = (int) (Math.random() * n);                  //получить случайный номер строки
            int y = (int) (Math.random() * n);                  //получить случайный номер столбца
            if(matrix[x][y]==0){                                //если полученный случайный элемент матрицы не заполнен
                matrix[x][y] = count;                           //внести число равное текущему счётчику
                count--;
            }

        }
        return matrix;
    }

    static boolean verticalCheck(int[][]matrix, int m){         //проверка вертикалей
        boolean result = true;                                  //по умолчанию результат - тру
        int counter = 0;                                        //счётчик
        while (counter<matrix.length&& result){                 //пока счётчик меньше размера проверяемой матрицы
            if (m==sumVertical(matrix, counter)){               //если сумма элементов строки с индексом счётчика равна магической константе
                counter++;                                      //инкремент счётчика
            }
            else {
                result=false;                                   //иначе результат фолс, прервать цикл
                break;
            }
        }
        return result;
    }

    static boolean horisontalCheck(int[][]matrix, int m){       //проверка горизонталей (см. вертикали, тож самое)
        boolean result = true;
        int counter = 0;
        while (counter<matrix.length&& result){
            if (m==sumHorisontal(matrix, counter)){
                counter++;
            }
            else {
                result=false;
                break;
            }
        }
        return result;
    }

    static int sumVertical (int[][]matrix, int indexOfColumn){  //метод считает сумму элементов матрицы в стобце с индексом, который метод принимает в параметрах
        int sum = 0;
        for (int i = 0; i<matrix.length; i++){
            sum+=matrix[i][indexOfColumn];
        }
        return sum;
    }

    static int sumHorisontal (int[][]matrix, int indexOfLine){  //см комментарии выше, то же самое, но по строкам
        int sum = 0;
        for (int i = 0; i<matrix.length; i++){
            sum+=matrix[indexOfLine][i];
        }
        return sum;
    }

    static boolean sumMainDiagonal (int[][]matrix, int m){          //считает сумму элементов главной диагонали, сравнивает с констанктой, возвращает результат булин
        int sum = 0;
        for (int i = 0; i<matrix.length; i++){
            sum+=matrix[i][i];
        }
        return sum==m;
    }

    static boolean sumSideDiagonal (int[][]matrix, int m){          //см. комментарии выше, толко этот считает побочную диагональ
        int sum = 0;
        for (int i = matrix.length-1; i>=0;){
            for (int j = 0; j< matrix.length; j++){
                sum+=matrix[j][i];
                i--;
            }
        }
        return sum==m;
    }
}

