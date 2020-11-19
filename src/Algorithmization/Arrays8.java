package Algorithmization;

public class Arrays8 {
    public static void main(String[] args) {
        int[]array = new int[1000];                 // создание массива
        for (int i = 1; i<=1000; i++) {               // заполнение
            array[i-1] = i;                               // массива (последовательности)
        }
        int min = array[0];
        for (int x : array){                        //
            if (x<min){                             // поиск min
                min = x;                            //
            }
        }
        int[]resultArray = new int[array.length];   //
        for (int i = 0; i<array.length; i++){       //
            if (array[i]==min){                     //
                resultArray[i]=0;                   //образование новой последовательности без min элементов
            }                                       //
            else {                                  //
                resultArray[i] = array[i];          //
            }
        }
    }
}
