package Algorithmization.ArraysPlusSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysPlusSort6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //запрос индекса
        System.out.println("Введите n:");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n + 5);                                      //заполнение рандомными числами
        }
        System.out.println("Массив до сортировки: ");
        for (int x : array) {                                                            //вывод на печать
            System.out.print(x + " ");
        }

        for (int i = 1; i < array.length; i++) {                                        //перебор массива (можно добавить шаг, через который будут сравниваться соседи, когда шаг 1, как тут - получается та же вставка)
            for (int j = i; j >= 1; j--) {                                              //декремент нужен для сравнения соседей
                if (array[j] < array[j - 1]) {                                          //если сосед 1 меньше соседа 2
                    int temp = array[j];                                                //свап их
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
//        for (int i = 1; i < n; i++) {                                                  //работает так же, взято на википедии
//            for (int j = i - 1; array[j] > array[j + 1] ; j--) {
//                int x = array[j];
//                array[j] = array[j + 1];
//                array[j + 1] = x;
//            }
//        }
            System.out.println();
            System.out.println("Массив после сортировки: ");
            for (int x : array) {                                                            //вывод на печать
                System.out.print(x + " ");
            }
    }
}
