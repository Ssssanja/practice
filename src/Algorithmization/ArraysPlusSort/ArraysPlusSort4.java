package Algorithmization.ArraysPlusSort;

public class ArraysPlusSort4 {
    public static void main(String[] args) {
        int[] array = new int[20];                                                      //инициализация массива
//        array[0] = 0;                                                                 //заполнение по условию задачи, но тогда нет смысла в сортировке
//        for (int i = 1; i<array.length; i++){
//            array[i] = array[i-1] + ((int)(Math.random()*3));
//        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);                                      //заполнение рандомными числами
        }
        System.out.println("Массив до сортировки: ");
        for (int x : array) {                                                            //вывод на печать
            System.out.print(x + " ");
        }
        int count = 0;
        for (int i = array.length - 1; i > 0; i--) {                          //внешний цикл, проход с конца к началу
            for (int j = 0; j < i; j++) {                                   //внутренний цикл, с начала к концу
                if (array[j] > array[j + 1]) {                                    //если элемент больше следующего
                    int tmp = array[j];                                         //меняем местами
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Массив после сортировки: ");
        for (int x : array) {                                                            //вывод на печать
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Перестановок было " + count);
    }
}
