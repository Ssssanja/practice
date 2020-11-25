package Algorithmization.ArraysPlusSort;

public class ArraysPlusSort3 {
    public static void main(String[] args) {
        int[]array = new int[20];                                                      //инициализация массива
        array[0] = 0;
        for (int i = 1; i<array.length; i++){
            array[i] = array[i-1] + ((int)(Math.random()*3));                           //заполнение рандомными числами
        }
        System.out.println("Массив до сортировки по убыванию: ");
        for (int x : array){                                                            //вывод на печать
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i=0;i<array.length;i++){                                               //сортировка выбором
            int max = array[i];                                                         //внешний цикл определяет номер прохода, внутренний, за поиск наибольшего значения (от +1 к номеру прохода)
            int index = i;                                                              //найденный максимум ставится в первую позицию(номер прохода +1)
            for (int j = i + 1; j<array.length; j++){
                if (array[j]>max){
                    index = j;
                    max = array[j];
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
        System.out.println();
        System.out.println("Массив после сортировки по убыванию: ");
        for (int x : array){
            System.out.print(x + " ");
        }
    }
}
